import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy, sonuc;
        Scanner indeks = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Giriniz: ");

        if (indeks.hasNextDouble()) {
            kilo = indeks.nextDouble();
            System.out.print("Lütfen Boyunuzu (m) Giriniz: ");

            if (indeks.hasNextDouble()) {
                boy = indeks.nextDouble();
                System.out.println("Hesaplama Yapılıyor Lütfen Bekleyiniz...");
                sonuc = kilo / (boy * boy);
                double D = sonuc;
                float sonucf = (float) D;
                System.out.println("Vücut Kitle Indeksiniz: " + sonucf);
            } else {
                System.out.println("Bu Alana Yalnızca Sayı Girebilirsiniz.!");
            }
        } else {
            System.out.println("Bu Alana Yalnızca Sayı Girebilirsiniz.!");
        }
    }
}
