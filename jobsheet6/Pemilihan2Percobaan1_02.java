package jobsheet6;
import java.util.Scanner;

public class Pemilihan2Percobaan1_02 {

    public static void main(String[] args) {
        
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        int tahun = input02.nextInt();
        
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0){
            System.out.print(tahun +"Tahun Kabisat");
            }else if ((tahun % 400) == 0){
            System.out.println( tahun +"Tahun Kabisat");

            } 
            else {
            System.out.print("Bukan Tahun Kabisat");

            }
        } else {
            System.out.println("Bukan tahun Kabisat");
        }
    }
}