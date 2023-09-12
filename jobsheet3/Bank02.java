import java.util.Scanner;

public class Bank02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml_Tabungan_Awal, lama_Menabung;
        double presentasiBunga = 0.02, bunga, jmlTabunganAkhir;

        System.out.println("masukkan jumlah tabungan awal anda");
        jml_Tabungan_Awal = input.nextInt();
        System.out.println("masukkan lama menabung anda");
        lama_Menabung = input.nextInt();
        bunga = lama_Menabung * presentasiBunga * jml_Tabungan_Awal;
        jmlTabunganAkhir = bunga + jml_Tabungan_Awal;
        System.out.println("jumlah tabungan akhir anda adalah " + jmlTabunganAkhir);
    }
}