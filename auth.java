import java.io.File;
import java.io.BufferedWriter; 
import java.io.FileWriter;
import java.io.FileReader;  
import java.io.IOException; 
import java.util.*;
import java.io.BufferedReader; 

public class auth{

    /**
     * Fungsi ini digunakan untuk melakukan login
     *
     * @param email akun email pengguna
     * @param password password pengguna
     * @return boolean 
     */
    public static boolean login(String email, String password)throws IOException{

        String line = "";  
        String splitBy = ",";  
        String csvFile = "./data/Users.csv"; 
        BufferedReader br = new BufferedReader(new FileReader(csvFile));  
        boolean result = false;
        int countSame = 0;
    
        while ((line = br.readLine()) != null)     
        {  
          String[] datas = line.split(splitBy);      
          if(datas[1].equals(email) && datas[2].equals(password)){
            countSame = countSame + 1 ;
          }
        }
    
        
         if(countSame > 0){
          result = true;
         }
      
         return result;  
    
      }
    
        public static void viewLogin() throws IOException {
    
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Halaman Login");
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
    
            boolean login = login(email, password);
            if(login){
                 home.viewHome();
            }else{
    
              System.out.println("Gagal Login");
              viewLogin();
    
            }
            
    
          }
      
    /**
     * Fungsi ini digunakan untuk melakukan pengecekan terkait email
     *
     * @param email akun email pengguna 
     * @return boolean 
     */
          public static boolean checkEmail(String email) throws IOException {
        
            String line = "";  
            String splitBy = ",";  
            String csvFile = "./data/Users.csv"; 
            BufferedReader br = new BufferedReader(new FileReader(csvFile));  
            boolean result = false;
            int countSame = 0;
      
            while ((line = br.readLine()) != null)     
            {  
              String[] datas = line.split(splitBy);      
              if(datas[1].equals(email)){
                countSame = countSame + 1 ;
              }
            }  
      
           if(countSame == 0){
            result = true;
           }
        
             return result;
      
         }
      
    /**
     * Fungsi ini melakukan penambahan data pengguna
     *
     * @param name nama pengguna
     * @param email akun email pengguna 
     * @param password password akun pengguna 
     * @return boolean 
     */
         public static boolean insert(String name, String email, String password) throws IOException {
          String data = name + "," + email + "," + password;
          String csvFile = "./data/Users.csv";
          File file = new File(csvFile);
          boolean isFileEmpty = file.length() == 0;
  
          try (FileWriter fileWriter = new FileWriter(csvFile, true);
               BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
  
               
              if (!isFileEmpty) {
                  bufferedWriter.newLine();
              }
  
              bufferedWriter.write(data);

              bufferedWriter.close();
  
              return true;
  
          } catch (IOException e) {
              e.printStackTrace();
              return false;
          }
      }
      
             /*
             * Fungsi ini digunakan untuk menampilkan halaman register
             */
            public static void viewRegister() throws IOException {
      
              Scanner input = new Scanner(System.in);
        
              System.out.println();
              System.out.println("Halaman Regsiter");
              System.out.print("Nama: ");
              String name = input.nextLine();
              System.out.print("Email: ");
              String email = input.nextLine();
              System.out.print("Password: ");
              String password = input.nextLine();
        
              boolean isUnique = checkEmail(email);
            
             if(isUnique){
      
              boolean insert = insert(name, email, password); 
              if(insert){
                System.out.println("Selamat Register Berhasil");
                viewLogin();
              }else{
                System.out.println();
                System.out.println("Register Gagal");
                viewRegister();
              }
      
             }else{
              System.out.println();
              System.out.println("Register Gagal");
              viewRegister();
             }
       
        
            }
            
            /*
             * Fungsi ini digunakan untuk melakukan logout
             */
            public static void logout() throws IOException {
              System.out.println("Logout berhasil");
              main.main(new String[0]);
             }

}