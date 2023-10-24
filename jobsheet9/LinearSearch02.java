package jobsheet9;
import java.util.Scanner;

public class LinearSearch02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = input.nextInt();
        int[] arrayInt = new int[jumlahElemen];
        
        System.out.print("Masukkan isi array: ");
        jumlahElemen = input.nextInt();
        for (int i = 0; i < jumlahElemen; i++) {
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input.nextInt();

        int hasil = 0;
        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println("Key ada di posisi indeks ke-" + hasil);
    }
}
