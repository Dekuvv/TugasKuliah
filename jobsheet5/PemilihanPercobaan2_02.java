import java.util.Scanner;

public class PemilihanPercobaan2_02 {

    public static void main(String[] args) {
        
        Scanner input02 = new Scanner(System.in);

        System.out.print("Nilai uas\t: ");
        float uas = input02.nextFloat();
        System.out.print("Nilai uts\t: ");
        float uts = input02.nextFloat();
        System.out.print("Nilai kuis\t: ");
        float kuis = input02.nextFloat();
        System.out.print("Nilai tugas\t: ");
        float tugas = input02.nextFloat();

        float total = (uas*0.4F) + (uts*0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        //OUTPUT
        System.out.println("Nilai akhir =" + total + "sehingga" + message);

    }
}