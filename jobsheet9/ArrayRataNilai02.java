package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMahasiswa;
        double total=0, totalTidakLulus=0;
        double rata2, rata2MhsTidakLulus;
        int jmlhMhsLulus=0, jmlhMhsTdkLulus=0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();
        int [] nilaiMhs = new int[jumlahMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) {
                total += nilaiMhs[i];
                jmlhMhsLulus++;
                
            }else{
                totalTidakLulus += nilaiMhs [i];
                jmlhMhsTdkLulus++;

            }
        }
        rata2 = total/jmlhMhsLulus;
        System.out.println("Rata-rata Nilai Mahasiswa yang lulus = " + rata2);
        rata2MhsTidakLulus = totalTidakLulus/jmlhMhsTdkLulus;
        System.out.println("Rata-rata Nilai Mahasiswa yang tidak lulus = " + rata2MhsTidakLulus);
    }

}
