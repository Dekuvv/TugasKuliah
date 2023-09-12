public class ContohVariabel02 {

    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "bermain petak umpet";
        boolean Kalem = true;
        char jeniskelamin = 'L';
        byte _umurSayaSekarang = 19;
        double $ipk = 3.24, tinggi = 1.78;
        int BeratBadan = 52;
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Kalem Banget kah?" + Kalem);
        System.out.println("Jenis kelamin :" + jeniskelamin);
        System.out.println("Umurku saat ini :" + _umurSayaSekarang);
        System.out.println("Berat badanku :" + BeratBadan);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s, dan berbobot %s", $ipk, tinggi, BeratBadan));
    }
}
