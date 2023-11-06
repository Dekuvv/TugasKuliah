import java.util.Scanner;

public class TugasJobsheet9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahElemen;
        
        // Input banyaknya elemen array
        System.out.print("Masukkan banyaknya elemen array: ");
        jumlahElemen = input.nextInt();

        // Inisialisasi array
        int[] arrayInt = new int[jumlahElemen];

        // Input nilai tiap elemen array
        System.out.println("Masukkan nilai tiap elemen array: ");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("arrayInt[" + i + "]: ");
            arrayInt[i] = input.nextInt();
        }

        // Cari nilai tertinggi
        int nilaiTertinggi = arrayInt[0];
        for (int i = 1; i < jumlahElemen; i++) {
            if (arrayInt[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayInt[i];
            }
        }

        // Cari nilai terendah
        int nilaiTerendah = arrayInt[0];
        for (int i = 1; i < jumlahElemen; i++) {
            if (arrayInt[i] < nilaiTerendah) {
                nilaiTerendah = arrayInt[i];
            }
        }

        // Hitung rata-rata
        double rataRata = 0;
        for (int i = 0; i < jumlahElemen; i++) {
            rataRata += arrayInt[i];
        }
        rataRata /= jumlahElemen;

        // Cetak hasil
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Rata-rata: " + rataRata);
    }
}
