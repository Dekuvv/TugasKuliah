import java.util.Scanner;

public class Gaji01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jml_Masuk, jml_TidakMasuk, totalGaji;
        int gaji = 100000, potGaji = 25000;
        
        //INPUT
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda\t\t:");
        jml_Masuk = input.nextInt();

        System.out.print("Masukkan jumlah hari tidak masuk kerja anda\t:");
        jml_TidakMasuk = input.nextInt();

        totalGaji=(jml_Masuk*gaji)-(jml_TidakMasuk*potGaji);

        System.out.print("Gaji yang anda terima adalah\t\t\t: " +totalGaji);
    }
}