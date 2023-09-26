import java.util.Scanner;

public class LatihanIndividu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak serang yang sering anda gunakan: ");
        int jarak = input.nextInt();

        if (jarak<=5) {
            System.out.println("Gunakan Melee Weapon");
            
        } else {
            System.out.println("Gunakan Range Weapon");
        }
    }
}