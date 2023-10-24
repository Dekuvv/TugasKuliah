package jobsheet9;
import java.util.Scanner;

public class ArrayBilangan02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float [] bil = new float[4];

        bil[0] = 5.0f;
        bil[1] = 12867;
        bil[2] = 7.5f;
        bil[3] = 2000000;

        for (int i = 0; i < 4; i++){
            System.out.println(bil[i]);
        }
        //System.out.println(bil[0]);
        //System.out.println(bil[1]);
        //System.out.println(bil[2]);
        //System.out.println(bil[3]);
    }
}