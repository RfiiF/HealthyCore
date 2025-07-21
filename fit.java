import java.util.*;
import java.io.IOException; 


public class fit {

    interface Feature {
        void execute() throws IOException ;
    }

    /**
     * Fungsi ini digunakan untuk menampilkan menu fitur kebugaran
     */
    public static void viewFeature() throws IOException {
        Scanner input = new Scanner(System.in);
        String[] features = {"Kalkulator Detak Jantung (RHR)", "Kalkulator BMI", "Kalkulator Kebutuhan Kalori", "Halaman Utama"};
        Feature[] function = {
            fit::rhr,
            fit::bmi,
            fit::calori
        };

        System.out.println();
        System.out.println("Fitur Kebugaran");
        for(int i = 0; i < features.length; i++){
            System.out.println(i + 1 + ". " + features[i]);
        }

        System.out.print("Pilih fitur aplikasi: ");
        int choice = input.nextInt();
        
        while(choice > features.length || choice <= 0){
               System.out.println("Salah pilih");
               System.out.print("Pilih fitur aplikasi: ");
               choice = input.nextInt();
        }

        if(choice - 1 == 3){
            home.viewHome();
        }else{
            function[choice - 1].execute();
        }

    }

    /**
     * Fungsi ini digunakan untuk menampilkan menu fitur Kalkulator Detak Jantung (RHR)
     */
    public static void rhr() throws IOException {
        Scanner input = new Scanner(System.in);
        int num, age;
        String result;

        do{

            System.out.println();
            System.out.print("Umur:");
            age = input.nextInt();

            System.out.print("Jumlah Detak jantung per menit:");
            num = input.nextInt(); 

        }while(num < 40 || num > 200);


        int maxNormal, minNormal; 
        if(age < 2){
            maxNormal = 130;
            minNormal = 80;
        }else if(age < 5){
            maxNormal = 120;
            minNormal = 80;
        }else if(age < 7){
            maxNormal = 115;
            minNormal = 75;
        }else if(age < 10){
            maxNormal = 110;
            minNormal = 70;
        }else if(age > 9){
            maxNormal = 100;
            minNormal = 60;
        }else{
            maxNormal = 0;
            minNormal = 0;
        }


        if(num < minNormal || num > maxNormal){
           result = "Abnormal";
        }else{
            result = "Normal";
        }

        System.out.println("Detak jantung istirahat (RHR) Anda Diklasifikasikan " + result);
        viewFeature();

    }

    /**
     * Fungsi ini digunakan untuk menampilkan menu fitur Kalkulator Kebutuhan Kalori
     */
    public static void calori() throws IOException {
        Scanner input = new Scanner(System.in);
        int height, gender, age, activity;
        double weight; 

        System.out.print("Berapa berat badan(Kg): ");
        weight = input.nextDouble();


        System.out.print("Berapa tingi badan(M): ");
        height = input.nextInt();

        System.out.print("Umur anda:");
        age = input.nextInt();

        
        System.out.println("1.Laki-laki\n2.Perempuan");
        System.out.print("Jenis kelamin Anda:");
        gender = input.nextInt();
        
        while(gender > 2 || gender <= 0){
            System.out.println();
            System.out.println("1.Laki-laki\n2.Perempuan");
            System.out.print("Jenis kelamin Anda:");
            gender = input.nextInt();
        }


       
        System.out.println("1.Sedikit atau tanpa aktivitas\n2.1-3 aktivitas berat\n3.4-7 aktivitas berat");
        System.out.print("Jumlah aktivitas keseharian:");
        activity = input.nextInt();
        
        while(activity > 3 || activity <= 0){
            System.out.println();
            System.out.println("Pilihan anda salah");
            System.out.println("1.Sedikit atau tanpa aktivitas\n2. 1-3 aktivitas berat\n3. 4-7 aktivitas berat");
            System.out.print("Jumlah aktivitas keseharian:");
            activity = input.nextInt();
        }

        double result, formulaWeight, formulaHeight, formulaYear;
        int product;

        if(activity > 2){
            product =  8;
        }else if(activity > 1){
            product =  4;
        }else{
            product =  2;
        }

        if(gender > 1){

            formulaWeight = 88.4 + 13.4 * weight;
            formulaHeight = 4.8 * height;
            formulaYear = 5.68 * age;
            result = (formulaWeight + formulaWeight - formulaYear) * product;

        }else{

            formulaWeight = 88.4 + 13.4 * weight;
            formulaHeight = 4.8 * height;
            formulaYear = 5.68 * age;
            result = (formulaWeight + formulaWeight - formulaYear) * product;

        }

        System.out.println(
         "Berdasarkan aktivitas kamu jumlah kalori minimal yang kamu butuhkan sebanyak " + result
        );

         viewFeature();
    }

    /**
     * Fungsi ini digunakan untuk menampilkan menu fitur Kalkulator BMI
     */
   public static void bmi() throws IOException {
    Scanner input = new Scanner(System.in);
    int choice;
    double height, weight, bmi; 
    String result;
 

   do{
    System.out.println();
    System.out.println("1. Laki-laki\n2.Perempuan");
    System.out.print("Jenis kelamin anda:");
    choice = input.nextInt();
   }while(choice > 2 || choice <= 0);


   do{ 
     System.out.println();
     System.out.print("Tinggi Anda (cm):");
     height = input.nextDouble(); 
   }while(height <= 0);


   do{ 
    System.out.println();
    System.out.print("Berat badan Anda (kg):");
    weight = input.nextDouble(); 
  }while(weight <= 0);


    bmi = weight / Math.pow(height, 2);

    if(bmi >= 30){
        result = "Obesitas";
    }else if(bmi < 30){
        result = "Kelebihan berat badan";
    }else if(bmi < 25){
        result = "Berat badan normal";
    }else if(bmi < 18.5){
         result = "Kekurangan berat badan";
    }else{
        result = "Opps sepertinya ada yang salah";
    }

    System.out.println();
    System.out.println("Berikut adalah hasil pengecekan kami");
    System.out.println(result);
    viewFeature();

   }



}