package day_7_All_Operators;

import java.util.Scanner;

public class Day_7_Odev {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);

       /* Ödev: Scanner sınıfını kullanarak kullanıcıdan 10 ile 100 arasında bir rakam aldırın;
        Bu sayıyı operatör kullanarak 5 ile çarpın;
        Çıkan sonucu operatör kullanarak 2 ye bölün;
        Çıkan sonucu operatör kullanarak 1 arttırın;
        Çıkan sonucu operatör kullanarak 4 e göre modunu alın;
        Çıkan sonucu operatör kullanarak 1 azaltın;
        Çıkan sonucu ekrana yazdırın.
        */

        System.out.print("10 ile 100 arasında bir sayı girin :");
        double sayi=scan.nextDouble();

        int carp=5, bol=2, mod=4;
        System.out.println("Girilen sayının 5 ile Çarpımı: " + (sayi*=carp));
        System.out.println("Çıkan sonucun 2 ile bölümü: " + (sayi/=bol));
        System.out.println("Çıkan sonucun 1 artır: " + (++sayi));
        System.out.println("Çıkan sonucun 4 göre Mod'u: " + (sayi%=mod));
        System.out.println("Çıkan sonucun 1 azalt: " + (--sayi));


        /*
        Ödev:
Kullanıcıdan double araba fiyatı ,KDV , ÖTV oranını alın. Araba fiyatı üzerinden KDV miktarını
hesaplayın . Hesapladığınız toplam tutar (araba +KDV miktarı) üzerinden ÖTV oranındaki artışı
toplam tutara ekleyerek hesaplayın. Çıkan sonuç 700.000 ve üzeri ile 1.000.000 (bir milyon)
arasında ise ekrana true yazdırın
         */


        /*
        Ödev:
Scanner sınıfını kullanarak kullanıcıdan önce String türünde kullanıcının ismini alın ardından
double türünde 0-100 arasında 3 sayı alın ;
Bu verileri kullanarak
1. Ortalama 70 ile 80 arasında ise ekrana true;
2. Ortalama 80 ve üzeri ile 90 arasında ise false;
3. 90 ve üzeri 100 arasında ise true;
4. Tam 100 ise ekrana false yazdırın
         */
    }
}
