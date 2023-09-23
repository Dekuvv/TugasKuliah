import java.util.Scanner;

public class Gaji01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jml_Masuk, jml_TidakMasuk, totalGaji, gaji, potGaji;
        
        //INPUT
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda\t\t: ");
        jml_Masuk = input.nextInt();

        System.out.print("Masukkan jumlah hari tidak masuk kerja anda\t: ");
        jml_TidakMasuk = input.nextInt();
        
        System.out.print("Masukkan Gaji Kerja Anda\t\t\t: ");
        gaji = input.nextInt();
    
        System.out.print("Masukkan Potongan Gaji Anda\t\t\t: ");
        potGaji = input.nextInt();

        totalGaji=(jml_Masuk*gaji)-(jml_TidakMasuk*potGaji);

        System.out.print("Gaji yang anda terima adalah\t\t\t: " +totalGaji);
    }
}