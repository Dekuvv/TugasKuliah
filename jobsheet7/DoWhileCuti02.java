package jobsheet7;

import java.util.Scanner;

public class DoWhileCuti02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();
                while (jatahCuti < jumlahHari){
                    System.out.println("Jumlah hari yang anda masukkan lebih besar dari sisa jatah cuti yang anda miliki");
                    System.out.print("Coba lagi: ");
                    jumlahHari = sc.nextInt(jumlahHari);
                }

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            }else{
                break;
            }
        } while (jatahCuti > 0);
    }
}