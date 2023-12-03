import java.util.Scanner;

public class coba {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama: ");
        double num1 = scanner.nextDouble();

        System.out.println("Masukkan bilangan kedua: ");
        double num2 = scanner.nextDouble();

        System.out.println("Pilih operasi: \n 1. Tambah \n 2. Kurang \n 3. Kali \n 4. Bagi");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                tambah(num1, num2);
                break;
            case 2:
                kurang(num1, num2);
                break;
            case 3:
                kali(num1, num2);
                break;
            case 4:
                bagi(num1, num2);
                break;
            default:
                System.out.println("Operasi tidak valid");
        }

        scanner.close();
    }

    public static void tambah(double num1, double num2) {
        double hasil = num1 + num2;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    public static void kurang(double num1, double num2) {
        double hasil = num1 - num2;
        System.out.println("Hasil pengurangan: " + hasil);
    }

    public static void kali(double num1, double num2) {
        double hasil = num1 * num2;
        System.out.println("Hasil perkalian: " + hasil);
    }

    public static void bagi(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Pembagian dengan 0 tidak diizinkan");
        } else {
            double hasil = num1 / num2;
            System.out.println("Hasil pembagian: " + hasil);
        }
    }
}