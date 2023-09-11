import java.util.Scanner;

public class contohproject {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Input
        System.out.print("Nama Pemesan: ");
        String namaPemesan = inputScanner.nextLine();

        System.out.print("Tanggal Pemesanan: ");
        String tanggalPemesanan = inputScanner.nextLine();

        System.out.print("Tanggal Acara: ");
        String tanggalAcara = inputScanner.nextLine();

        System.out.print("Jumlah Tamu: ");
        int jumlahTamu = inputScanner.nextInt();
        inputScanner.nextLine(); // Membuang karakter baru yang tersisa

        System.out.print("Jenis Gedung: ");
        String jenisGedung = inputScanner.nextLine();

        // Proses pemesanan dan perhitungan harga (tidak ditampilkan di sini)

        // Simulasikan pemesanan berhasil
        boolean pemesananBerhasil = true;

        // Output
        if (pemesananBerhasil) {
            System.out.println("\n--- Konfirmasi Pemesanan Berhasil ---");
            System.out.println("Nama Pemesan: " + namaPemesan);
            System.out.println("Tanggal Pemesanan: " + tanggalPemesanan);
            System.out.println("Tanggal Acara: " + tanggalAcara);
            System.out.println("Jumlah Tamu: " + jumlahTamu);
            System.out.println("Jenis Gedung: " + jenisGedung);
            System.out.println("Pemesanan berhasil. Terima kasih!");
        } else {
            System.out.println("Maaf, pemesanan gagal. Silakan coba lagi nanti.");
        }

        // Tutup scanner
        inputScanner.close();
    }
}
