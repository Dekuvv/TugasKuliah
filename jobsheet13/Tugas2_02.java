package jobsheet13;
import java.util.Scanner;

public class Tugas2_02 {
    static int penjumlahanRekursif (int x) {
        if (x == 0) {
            return(0);
        } else  {
            return (x + penjumlahanRekursif(x - 1));
        }   
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        int N = sc.nextInt();

        for (int i = 1; i < N; i++) {
            System.out.print(i + " + ");
        }
        System.out.print(N + " = ");
        System.out.println(penjumlahanRekursif(N));
    }
}