import java.util.Scanner;

public class HargaBayar01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //Deklarasi
        int harga, jumlah, jml_Halaman;
        double dis=0.1, total, bayar, jumlahDis;
        String merkBuku;

        System.out.print("Masukkan harga barang yang dibeli\t\t: " + "Rp");
        harga = input.nextInt();

        System.out.print("Masukkan jumlah-jumlah barang yang dibeli\t: ");
        jumlah = input.nextInt();

        System.out.print("Halaman Buku\t\t\t\t\t: ");
        jml_Halaman = input.nextInt();

        System.out.print( "Merk buku\t\t\t\t\t: ");
        input.nextLine();

        System.out.println("Masukkan Diskon Yang Anda Dapat\t: ");
        merkBuku = input.nextLine();

        total = harga*jumlah;
        jumlahDis = total*dis;
        bayar = total-jumlahDis;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Merk buku yang anda beli adalah\t\t: " + merkBuku);
        System.out.println("Halaman Buku Anda\t\t: " + jml_Halaman);
        System.out.println("Diskon yang anda dapatkan adalah\t: " + "Rp" + jumlahDis);
        System.out.println("Jumlah yang harus dibayar adalah\t: " + "Rp"+ bayar);
    }
}