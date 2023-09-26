import java.util.Scanner;

public class PemilihanPercobaan2_02 {

    public static void main(String[] args) {
        
        Scanner input02 = new Scanner(System.in);

        float uas, uts, kuis, tugas, nilaiAkhir;

        System.out.print("Nilai uas\t: ");
        uas = input02.nextFloat();
        System.out.print("Nilai uts\t: ");
        uts = input02.nextFloat();
        System.out.print("Nilai kuis\t: ");
        kuis = input02.nextFloat();
        System.out.print("Nilai tugas\t: ");
        tugas = input02.nextFloat();

        nilaiAkhir = (uas*0.4F) + (uts*0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        System.out.println("Nilai AKhir Anda Adalah");

        String message = nilaiAkhir < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai akhir =" + nilaiAkhir + "sehingga" + message);

        if (80<nilaiAkhir && nilaiAkhir<=100) {
            System.out.println("Nilai Akhir = A");
        }else if (73<nilaiAkhir && nilaiAkhir <=80) {
            System.out.println("Nilai Akhir = B");
        }else if (65<nilaiAkhir && nilaiAkhir<=73) {
            System.out.println("Nilai Akhir = B+");
        }else if (60<nilaiAkhir && nilaiAkhir<=65) {
            System.out.println("Nilai Akhir = C+");
        }else if (50<nilaiAkhir && nilaiAkhir<=60){
            System.out.println("Nilai Akhir = C");
        }else if (39<nilaiAkhir && nilaiAkhir<=50){
            System.out.println("Nilai Akhir = D");
        }else if (nilaiAkhir<=39){
            System.out.println("Nilai Akhir = E");
        }else {System.out.println("COBA LAGI");}
    
        input02.close();
    

    }
}