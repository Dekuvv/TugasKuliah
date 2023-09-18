import java.util.Scanner;

public class Lingkaran01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Deklarasi
        int r;
        double keliling, luas;

        //Input
        System.out.print("Masukkan jari-jari lingkaran\t: ");
        r = input.nextInt();
        keliling = 2*3.14*r;
        luas = 3.14*r*r;
        
        System.out.println("Keliling lingkaran adalah\t: " + keliling);
        System.out.println("Luas lingkaran adalah\t\tt: " +luas);
    }
}