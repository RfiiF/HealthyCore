
import java.util.*;
import java.io.IOException;

public class main{

  

     /**
     * Fungsi ini digunakan untuk menampilkan menu
     */
    public static void selectFeatures() throws IOException {

        String[] feature = {"Login", "Register"}; 

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < feature.length; i++){
            System.out.println(i + 1 + ". " + feature[i]);
          } 

          System.out.print("\nPilih: ");
          int a = input.nextInt();

        while(a > feature.length || a <= 0){

            System.out.println();

            for(int i = 0; i < feature.length; i++){
                System.out.println(i + 1 + ". " + feature[i]);
              } 

              System.out.print("\nPilih yang sesuai: ");
              a = input.nextInt();

        }


        if(a == 1){

          auth.viewLogin();

        }else if(a == 2){

          auth.viewRegister();

        }else{
          System.out.println("Sepertinya ada yang salah"); 
        }

    }

     
   public static void main(String[] args) throws IOException {
  
    System.out.println("\nSelamat Datang Di Aplikasi Cek Kesehatan Digital");
    System.out.println("\nSilahkan masuk ke aplikasi \n"); 
    selectFeatures(); 

   } 

}