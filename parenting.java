import java.util.*;
import java.io.IOException; 

public class parenting {

    interface Feature {
        void execute() throws IOException;
    }
    
     
     /**
     * Fungsi ini digunakan untuk menampilkan menu fitur Kehamilan & Parenting
     */
    public static void viewFeature() throws IOException {
        Scanner input = new Scanner(System.in);
        String[] features = {"Deteksi anemia defisiensi besi anak", "Kalkulator kebutuhan protein anak", "Halaman Utama"};
        Feature[] function = {
            parenting::deteksiADBanak,
            parenting::KalkulatorProteinAnak  
        };


        System.out.println();
        System.out.println("Fitur Kehamilan dan Parenting");
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

        if(choice - 1 == 2){
            home.viewHome();
        }else{
            function[choice - 1].execute();
        }

    }

    
    /**
     * Fungsi ini digunakan untuk Deteksi anemia defisiensi besi anak
     */
    public static void deteksiADBanak() throws IOException {
        Scanner input = new Scanner(System.in);
        int skor = 0;
        int pilih;

        do { // soal no 1
            System.out.println("\nApakah anak anda sering merasa lelah atau lesu bahkan setelah istirahat yang cukup?");
            System.out.print("1. Tidak pernah \n2. Kadang-kadang \n3. Sering \n4. Selalu \n > ");
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
            System.out.println("\nApakah anak Anda sering mengalami pusing atau sakit kepala?");
            System.out.print("1. Tidak pernah \n2. Kadang-kadang \n3. Sering \n4. Selalu \n > ");
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
            System.out.println("\nApakah anak Anda sering terlihat pucat, terutama pada kulit, wajah, kuku, bibir, dan gusi?");
            System.out.print("1. Tidak (Dalam dua pekan terakhir) \n2. Ya (Dalam 2 pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 2 || pilih < 1);

        do { // soal no 4
            System.out.println("\nApakah anak Anda memiliki kesulitan dalam berkonsentrasi atau sering merasa bingung?");
            System.out.print("1. Tidak pernah \n2. Kadang-kadang \n3. Sering \n4. Selalu \n > ");
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
            System.out.println("\nApakah anak Anda mengalami sesak napas atau detak jantung cepat?");
            System.out.print("1. Tidak pernah \n2. Kadang-kadang \n3. Sering \n4. Selalu \n > ");
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
            System.out.println("\nApakah anak Anda memiliki nafsu makan yang buruk atau mengalami penurunan berat badan tanpa alasan jelas?");
            System.out.print("1. Tidak (Dalam dua pekan terakhir) \n2. Ya (Dalam 2 pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 2 || pilih < 1);

        do { // soal no 7
            System.out.println("\nSeberapa sering anak Anda mengonsumsi makanan kaya zat besi (daging merah, hati, sayuran berdaun hijau, kacang-kacangan)?");
            System.out.print("1. Tidak pernah \n2. Kadang-kadang \n3. Sering \n4. Selalu \n > ");
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
            System.out.println("\nApakah anak Anda mengonsumsi suplemen zat besi");
            System.out.print("1. Tidak pernah \n2. Kadang-kadang \n3. Sering \n4. Selalu \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 3;
            } else if (pilih == 2){
                skor = skor + 2;
            } else if (pilih == 3){
                skor = skor + 1;
            } else if (pilih == 4) {
                skor = skor + 0;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 4 || pilih < 1);

        do { // soal no 9
            System.out.println("\nApakah anak Anda mengonsumsi susu sapi dalam jumlah besar setiap hari (lebih dari 500 ml)");
            System.out.print("1. Tidak (Dalam dua pekan terakhir) \n2. Ya (Dalam 2 pekan terakhir) \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 2 || pilih < 1);

        do { // soal no 10
            System.out.println("\nApakah anak Anda mengonsumsi makanan atau minuman yang dapat mengganggu penyerapan zat besi (misalnya teh, kopi)?");
            System.out.print("1. Tidak pernah \n2. Kadang-kadang \n3. Sering \n4. Selalu \n > ");
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

        do { // soal no 11
            System.out.println("\nApakah anak Anda pernah mengalami infeksi kronis atau penyakit yang berhubungan dengan kehilangan darah (misalnya, pendarahan gastrointestinal)?");
            System.out.print("1. Tidak \n2. Ya \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 2 || pilih < 1);

        do { // soal no 12
            System.out.println("\nApakah anak Anda pernah didiagnosis dengan kondisi medis yang dapat mempengaruhi penyerapan zat besi (misalnya, penyakit celiac)");
            System.out.print("1. Tidak \n2. Ya \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 2 || pilih < 1);

        do { // soal no 13
            System.out.println("\nApakah anak Anda lahir prematur atau dengan berat badan lahir rendah?");
            System.out.print("1. Tidak \n2. Ya \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 2 || pilih < 1);

        do { // soal no 14
            System.out.println("\nApakah ada riwayat anemia defisiensi besi dalam keluarga");
            System.out.print("1. Tidak \n2. Ya \n > ");
            pilih = input.nextInt();

            if (pilih == 1) {
                skor = skor + 0;
            } else if (pilih == 2){
                skor = skor + 3;
            } else {
                System.out.println("\nERROR!!! Harap memilih opsi yang sesuai");
            }
        } while (pilih > 2 || pilih < 1);

        if (skor >= 0 && skor <= 9) {
            System.out.println("\nAnak memiliki *RISIKO RENDAH* untuk mengalami anemia defisiensi besi. \nNamun, tetap penting untuk memantau asupan nutrisi dan kesehatan anak secara berkala.");
        } else if (skor >= 10 && skor <= 19){
            System.out.println("\nAnak memiliki *RISIKO SEDANG* untuk anemia defisiensi besi. \nDisarankan untuk melakukan perubahan diet dengan meningkatkan asupan makanan kaya zat besi dan mungkin mulai mempertimbangkan suplemen zat besi. Konsultasi dengan dokter dianjurkan untuk evaluasi lebih lanjut.");
        } else if (skor >= 20 && skor <= 45){
            System.out.println("\nAnak memiliki *RISIKO TINGGI* untuk anemia defisiensi besi. \nSangat disarankan untuk segera konsultasi dengan dokter untuk pemeriksaan lebih lanjut, termasuk tes darah untuk mengukur kadar hemoglobin dan feritin serum. Perubahan diet dan/atau suplemen zat besi mungkin diperlukan segera.");
        } else {
            System.out.println("\nERROR!!!");
        }

        viewFeature();

    }

    /**
     * Fungsi ini digunakan untuk Kalkulator kebutuhan protein anak
     */
    public static void KalkulatorProteinAnak() throws IOException {
        Scanner input = new Scanner(System.in);

        int usia = 0;
        int tinggi = 0;
        int berat = 0;
        int gender = 0;
        int aktivitas = 0;
        double faktorProtein = 0;
        double tambahanGender = 0;
        double tambahanAktivitas = 0;
        double kebutuhanDasar = 0;
        double kebutuhanDasarTambah = 0;
        double kebutuhanProtein = 0;

        System.out.println("\nJenis kelamin anak anda ");
        System.out.print("1. Perempuan \n2. Laki-laki \n > ");
        gender = input.nextInt();

        while (gender > 2 || gender <= 0) {
            System.out.println("\nHarap memilih opsi yang telah disediakan\n");
            System.out.println("Jenis kelamin anak anda ");
            System.out.print("1. Perempuan \n2. Laki-laki \n > ");
            gender = input.nextInt();
        }

        System.out.print("\nUsia anak anda (3-12 tahun) = \n > ");
        usia = input.nextInt();

        while (usia > 12 || usia < 3){
            System.out.println("\nHarap memilih opsi yang telah disediakan\n");
            System.out.print("Usia anak anda (3-12) = \n > ");
            usia = input.nextInt();
        }

        System.out.println("\nSeberapa aktif anak anda? ");
        System.out.print("1. Sangat aktif \n2. Aktif \n3. Kurang aktif \n > ");
        aktivitas = input.nextInt();

        while (aktivitas > 3 || aktivitas <= 0) {
            System.out.println("\nHarap memilih opsi yang telah disediakan\n");
            System.out.println("Seberapa aktif anak anda? ");
            System.out.print("1. Sangat aktif \n2. Aktif \n3. Kurang aktif \n > ");
            aktivitas = input.nextInt();
        }

        System.out.print("\nBerapa tinggi badan anak anda? Dalam cm \n > ");
        tinggi = input.nextInt();

        while (tinggi > 160 || tinggi < 80 ) {
            System.out.println("\nHarap memasukkan tinggi badan yang sesuai/normal");
            System.out.println("Berapa tinggi badan anak anda? Dalam cm \n > ");
            tinggi = input.nextInt();
        }

        System.out.print("\nBerapa berat badan anak anda? Dalam kg \n > ");
        berat = input.nextInt();

        while (berat > 50 || berat <= 9 ) {
            System.out.println("\nHarap memasukkan berat badan yang sesuai/normal");
            System.out.print("Berapa berat badan anak anda? Dalam kg \n > ");
            berat = input.nextInt();
        }

        if (gender == 2) {
            tambahanGender = 0.1;
        } else {
            tambahanGender = 0;
        }

        if (usia == 3 || usia == 4 || usia == 5 || usia == 6) {
            faktorProtein = 1.1;
        } else if (usia == 7 || usia == 8 || usia == 9 || usia == 10){
            faktorProtein = 1.0;
        } else if (usia == 11 || usia == 12){
            faktorProtein = 0.9;
        } else {
            System.out.println("ERROR!!! (HARAP MEMILIH USIA YANG BENAR)");
        }

        if (aktivitas == 1) {
            tambahanAktivitas = 0.3;
        } else if (aktivitas == 2){
            tambahanAktivitas = 0.2;
        } else if (aktivitas == 3) {
            tambahanAktivitas = 0.1;
        } else {
            System.out.println("ERROR!!! (HARAP MEMILIH AKTIVITAS YANG BENAR)");
        }

        if (gender == 1) {
            kebutuhanDasar = (berat * faktorProtein);
            kebutuhanDasarTambah = (kebutuhanDasar + 0);
            kebutuhanProtein = (kebutuhanDasarTambah + (kebutuhanDasarTambah * tambahanAktivitas));
        }

        if (gender == 2) {
            kebutuhanDasar = (berat * faktorProtein);
            kebutuhanDasarTambah = (kebutuhanDasar + (kebutuhanDasar * tambahanGender));
            kebutuhanProtein = (kebutuhanDasarTambah + (kebutuhanDasarTambah * tambahanAktivitas));
        }

        System.out.println("\nAnak Anda membutuhkan setidaknya " + kebutuhanProtein +" gram protein per hari.");
    
        viewFeature();
    }

}