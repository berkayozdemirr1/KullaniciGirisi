
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String KullaniciAdi, Sifre, SifreYeni, YeniSifre;

        Scanner deger = new Scanner(System.in);

        System.out.print("Kullanici Adi : ");
        KullaniciAdi = deger.nextLine();

        System.out.print("Sifre : ");
        Sifre = deger.nextLine();

        if ( KullaniciAdi.equals("berkay") && (Sifre.equals("berkay123"))) {
            System.out.println("Giris Basarili");
        }else{
            System.out.println("Kullanici Adi veya Sifre Yanlis.");
            System.out.print("Sifrenizi Sifirlamak Ister misiniz (e/h)");
            SifreYeni = deger.nextLine();

            if ((SifreYeni.equals("h"))) {
                System.out.println("Kullanici Adini ve Sifreni Dogru Gir O Zaman.");
            }
            else if (SifreYeni.equals("e"))  {
                System.out.print("Yeni Bir Sifre Belirleyiniz : ");
                YeniSifre = deger.nextLine();
                if (YeniSifre.equals("berkay123") || (YeniSifre.equals(Sifre)));
                System.out.print("Yeni Sifre Eskisiyle Ayni Olamaz.\nLutfen Yeni Bir Sifre Belirleyiniz: ");
                YeniSifre = deger.nextLine();
                System.out.print("Yeni Sifre Belirlendi.");
            }
            else {
                System.out.println("Lutfen e = evet h = hayir olacak sekilde cevaplayiniz.");
                System.out.println("Sifrenizi Sifirlamak Ister misiniz (e/h)");
                SifreYeni = deger.nextLine();}

        }
    }
}
