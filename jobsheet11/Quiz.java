package jobsheet11;
import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';
        do{
            int number = random.nextInt(10) + 1;
            boolean succes = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                succes = (answer == number);
                if (!succes) {
                    if (number < answer)
                        System.out.println("number < answer");
                    if ( number > answer)
                        System.out.println("number > answer");
                }
            }while(!succes);
            System.out.println("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        }while (menu == 'Y' || menu == 'y');
    }
}
