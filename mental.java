import java.util.*;
import java.io.IOException; 

public class mental {

    interface Feature {
        void execute() throws IOException;
    }

    /**
     * Fungsi ini digunakan untuk menampilkan menu fitur Mental
     */
    public static void viewFeature() throws IOException{
        Scanner input = new Scanner(System.in);
        String[] features = {"Tes Gangguan Kecemasan", "Cek Tingkat Stres", "Deteksi dini depresi", "Halaman utama"};
        Feature[] function = {
            mental::tesKecemasan,
            mental::tesStres,
            mental::deteksiDepresi  
        };

        System.out.println();
        System.out.println("Fitur Kesehatan Mental");
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
     * Fungsi ini digunakan untuk Tes Gangguan Kecemasan
     */
    public static void tesKecemasan() throws IOException {
        Scanner input = new Scanner(System.in);
        int skor = 0;
        int pilih;

        do { // soal no 1
            System.out.println("\nMerasa gugup, cemas, atau gelisah?");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();
                 
            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 2
            System.out.println("\nTidak mampu menghentikan atau mengendalikan rasa khawatir?");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 3
            System.out.println("\nKhawatir berlebihan tentang berbagai hal?");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4){
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 4
            System.out.println("\nSulit untuk merasa rileks?");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 5
            System.out.println("\nBegitu gelisah sehingga sulit untuk duduk diam?");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 6
            System.out.println("\nMenjadi mudah kesal atau jengkel?");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4){
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 7
            System.out.println("\nMerasa khawatir seakan sesuatu yang buruk akan terjadi?");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        if (skor >= 0 && skor <= 4) {
            System.out.println("\nRisiko Cemas Minimal. \nAnda mungkin sedang mengalami kecemasan minimal.");
        } else if (skor >= 5 && skor <= 9){
            System.out.println("\nRisiko Cemas Ringan. \nAnda mungkin sedang mengalami kecemasan level ringan.");
        } else if (skor >= 10 && skor <= 14){
            System.out.println("\nRisiko Cemas Tingkat Sedang.");
            System.out.println("Anda mungkin sedang mengalami kecemasan level sedang.");
            System.out.println("Kami sarankan Anda untuk melakukan pemeriksaan lanjutan ke tenaga kesehatan atau profesional kesehatan jiwa, seperti psikolog dan psikiater.");
        } else if (skor >= 15 && skor <= 21){
            System.out.println("\nRisiko Cemas Tingkat Berat");
            System.out.println("Anda mungkin sedang mengalami kecemasan level berat."); 
            System.out.println("Kami sarankan Anda untuk melakukan pemeriksaan lanjutan ke tenaga kesehatan atau profesional kesehatan jiwa, seperti psikolog dan psikiater.");
        } else {
            System.out.println("\nERROR!!!");
        }


        viewFeature();

    }

     /**
     * Fungsi ini digunakan untuk Tes Tingkat Stres
     */ 
    public static void tesStres() throws IOException {
        Scanner input = new Scanner(System.in);
        int skor = 0;
        int pilih;

        do { // soal no 1
            System.out.println("\nSering merasa terbebani dengan hidup, baik karena pendidikan atau pekerjaan saat ini");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 2
            System.out.println("\nKesulitan untuk tetap fokus dan konsentrasi, misalnya saat membaca buku atau menonton televisi");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 3
            System.out.println("\nSulit tidur dan sering terbangun pada malam hari atau bahkan tidur secara berlebihan");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 4
            System.out.println("\nMerasa kelelahan yang luar biasa selama menjalani kehidupan sehari-hari");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 5
            System.out.println("\nMengalami perubahan badan secara signifikan, karena kurang makan atau lebih banyak makan dari biasanya");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 6
            System.out.println("\nMerasa lebih gampang sakit yang bisa disertai gejala, seperti sakit kepala, ketegangan otot, kram perut, atau nyeri dada");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 7
            System.out.println("\nBerusaha untuk menarik diri dan menghindari interaksi dengan keluarga, teman, atau orang lain di sekitar");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 8
            System.out.println("\nMudah tersinggung, kesal, atau marah karena masalah sepele");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        if (skor >= 0 && skor <= 7) {
            System.out.println("\nAnda sedang TIDAK STRES");
        } else if (skor >= 8 && skor <= 14){
            System.out.println("\nAnda mungkin sedang mengalami STRES RINGAN");
        } else if (skor >= 15 && skor <= 21){
            System.out.println("\nAnda mungkin sedang mengalami STRES SEDANG");
            System.out.println("Kami sarankan Anda untuk melakukan pemeriksaan lanjutan ke tenaga kesehatan atau profesional kesehatan jiwa, seperti psikolog dan psikiater.");
        } else if (skor >= 22 && skor <= 24){
            System.out.println("\nAnda mungkin sedang mengalami STRES BERAT");
            System.out.println("Kami sarankan Anda untuk melakukan pemeriksaan lanjutan ke tenaga kesehatan atau profesional kesehatan jiwa, seperti psikolog dan psikiater.");
        } else {
            System.out.println("\nERROR!!!");
        }

        viewFeature();

    }

     /**
     * Fungsi ini digunakan untuk Depresi
     */
    public static void deteksiDepresi() throws IOException {
        Scanner input = new Scanner(System.in);
        int skor = 0;
        int pilih;

        do { // soal no 1
            System.out.println("\nKurang tertarik atau bergairah dalam melakukan apa pun");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 2
            System.out.println("\nMerasa murung, muram, atau putus asa");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();
    
            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 3
            System.out.println("\nSulit tidur atau mudah terbangun, atau terlalu banyak tidur");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();
    
            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 4
            System.out.println("\nMerasa lelah atau kurang berenergi");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();
    
            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 5
            System.out.println("\nKurang nafsu makan atau terlalu banyak makan");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();
    
            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 6
            System.out.println("\nKurang percaya diri atau merasa bahwa Anda adalah orang yang gagal atau telah mengecewakan diri sendiri atau keluarga");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();
    
            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 7
            System.out.println("\nSulit berkonsentrasi pada sesuatu, misalnya saat membaca buku atau menonton televisi");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();
    
            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 8
            System.out.println("\nBergerak atau berbicara sangat lambat sehingga orang lain merasakannya. Atau sebaliknya, merasa resah atau gelisah sehingga Anda lebih sering bergerak dari biasanya");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();
    
            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 9
            System.out.println("\nMerasa lebih baik mati atau melukai diri sendiri dengan cara apa pun");
            System.out.println("1. Tidak sama sekali (dalam dua pekan terakhir)");
            System.out.println("2. Beberapa hari (dalam dua pekan terakhir)");
            System.out.println("3. Lebih dari separuh waktu (dalam dua pekan terakhir)");
            System.out.print("4. Hampir setiap hari (dalam dua pekan terakhir) \n > ");
            pilih = input.nextInt();
    
            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 1;
            } else if (pilih == 3){
                skor = skor + 2;
            } else if (pilih == 4) {
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        if (skor >= 0 && skor <= 4) {
            System.out.println("\nRISIKO DEPRESI MINIMAL \nAnda mungkin sedang mengalami depresi minimal atau tidak depresi sama sekali. Ini adalah tingkatan depresi yang paling rendah.");
            System.out.println("Anda mungkin mengalami kesedihan sesekali, tetapi ini wajar dan bisa membaik seiring waktu.");
            System.out.println("Kami merekomendasikan Anda untuk tetap menjalani gaya hidup sehat. tidur yang cukup, dan beraktivitas fisik secara rutin.");
        } else if (skor >= 5 && skor <= 9){
            System.out.println("\nRISIKO DEPRESI TINGKAT RINGAN \nAnda mungkin sedang mengalami depresi tingkat ringan.");
            System.out.println("Mood Anda mungkin buruk dan membuat Anda enggan beraktivitas, tetapi gejala ini biasanya tidak begitu parah dan akan membaik seiring waktu.");
            System.out.println("Kami merekomendasikan Anda untuk tetap menjalani gaya hidup sehat. tidur yang cukup, dan beraktivitas fisik secara rutin.");
        } else if (skor >= 10 && skor <= 14){
            System.out.println("\nRISIKO DEPRESI CUKUP BERAT \nAnda mungkin sedang mengalami depresi yang cukup berat.");
            System.out.println("Kondisi ini mungkin membuat Anda jadi kurang produktif, tidak percaya diri, dan enggan beraktivitas.");
            System.out.println("Kami merekomendasikan Anda untuk berkonsultasi kepada tenaga kesehatan mental profesional, seperti psikolog atau psikiater. Jangan lupa terapkan juga gaya hidup sehat dan cukupi kebutuhan tidur Anda.");
        } else if (skor >= 15 && skor <= 27){
            System.out.println("\nRISIKO DEPRESI PARAH \nAnda mungkin sedang mengalami depresi berat.");
            System.out.println("Kondisi ini mungkin membuat Anda selalu merasa sedih, muram, dan tidak memiliki energi untuk melakukan aktivitas sehari-hari.");
            System.out.println("Kami merekomendasikan Anda untuk berkonsultasi kepada tenaga kesehatan mental profesional, seperti psikolog atau psikiater. Jangan lupa terapkan juga gaya hidup sehat dan cukupi kebutuhan tidur Anda.");
        } else {
            System.out.println("\nERROR!!!");
        }

        viewFeature();

    }

}