import java.util.*;
import java.io.IOException;
public class home{

     /**
     * Fungsi ini digunakan untuk menampilkan menu fitur utama
     */
    public static void viewHome() throws IOException  {

        Scanner input = new Scanner(System.in); 
        String[] features = {"Kehamilan & Parenting", "kebugaran", "Mental", "Logout"};
        System.out.println();
        System.out.println("Selamat datang di HealthyCore");
        System.out.println("Berikut adalah fitur aplikasi:");
        for(int i = 0; i < features.length; i++){
            System.out.println(i + 1 + ". " + features[i]);
        }
        System.out.print("Pilih: ");
        int choice = input.nextInt();
        
        while(choice > features.length || choice <= 0){
            System.out.println("Salah isi");
            System.out.println("Berikut adalah fitur aplikasi:");
            for(int i = 0; i < features.length; i++){
                System.out.println(i + 1 + ". " + features[i]);
            }
            System.out.print("Pilih: ");
            choice = input.nextInt();
        }

       
    switch (choice) { 
        case 1:
          parenting.viewFeature();
        break;
        case 2:
        fit.viewFeature();
        break;
        case 3:
        mental.viewFeature();
        break; 
        case 4:
        auth.logout();    
        break; 
        default:
            break;
    }
      
 

    }

}