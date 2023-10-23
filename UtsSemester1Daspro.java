import java.util.Scanner;

public class UtsSemester1Daspro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilaiPotensiAkademik, nilaiBahasaInggris, nilaiWawancara, jumlahCalonMahasiswa;
        String jurusan;
        double nilaiAkhir;

        System.out.print("Masukkan Jumlah Calon Mahasiswa: ");
        jumlahCalonMahasiswa = input.nextInt();

        for(int i = 1; i <= jumlahCalonMahasiswa; i++){

            System.out.println("Calon Mahasiswa" + i + ":");
            System.out.print("Masukkan nilai tes Potensi Akademik (0-100): ");
            nilaiPotensiAkademik = input.nextInt();
    
            System.out.print("Masukkan nilai tes Bahasa Inggris (0-100): ");
            nilaiBahasaInggris = input.nextInt();
    
            System.out.print("Masukkan nilai tes Wawancara (0-100): ");
            nilaiWawancara = input.nextInt();
    
            nilaiAkhir = (0.5*nilaiPotensiAkademik)+(0.3*nilaiBahasaInggris)+(0.2*nilaiWawancara);
            jurusan = "";
            if (jurusanInformasiTerpenuhi(nilaiBahasaInggris, nilaiWawancara)) {
                jurusan = "Sistem Informasi";
            } else if (jurusanIlmuKomputerTerpenuhi(nilaiPotensiAkademik)) {
                jurusan = "Ilmu Komputer";
            } else if (jurusanBisnisManajemenTerpenuhi(nilaiPotensiAkademik, nilaiBahasaInggris)) {
                jurusan = "Bisnis Manajemen";
            } else if (jurusanTeknikInformatikaTerpenuhi(nilaiPotensiAkademik, nilaiBahasaInggris)) {
                jurusan = "Teknik Informatika";
            } else {
                jurusan = "Tidak Memenuhi Syarat Jurusan Manapun";
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Nilai Akhir anda adalah\t\t:" + nilaiAkhir);
            System.out.println("Jurusan yang anda terima Adalah\t:" + jurusan);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    
    public static boolean jurusanInformasiTerpenuhi(int nilaiBahasaInggris, int nilaiWawancara) {
        return nilaiBahasaInggris >= 70 && nilaiWawancara > 80;
    }
    
    public static boolean jurusanIlmuKomputerTerpenuhi(int nilaiPotensiAkademik) {
        return nilaiPotensiAkademik > 70;
    }
    
    public static boolean jurusanBisnisManajemenTerpenuhi(int nilaiPotensiAkademik, int nilaiBahasaInggris) {
        return (nilaiPotensiAkademik + nilaiBahasaInggris) / 2 >= 75 && nilaiBahasaInggris >= 50;
    }
    
    public static boolean jurusanTeknikInformatikaTerpenuhi(int nilaiPotensiAkademik, int nilaiBahasaInggris) {
        return nilaiPotensiAkademik >= 60 && nilaiBahasaInggris == 100;
    }
}