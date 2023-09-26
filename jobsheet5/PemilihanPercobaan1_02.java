import java.util.Scanner;

public class PemilihanPercobaan1_02{
    public static void main(String[] args) {
        
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka;

        System.out.println("Masukkan Angka: ");
        angka = input02.nextInt();

        String hasil = angka % 2 == 0  ? "Adalah Bilangan Genap" : "Adalah bilangan Ganjil";
        System.out.println(hasil);
    }
}