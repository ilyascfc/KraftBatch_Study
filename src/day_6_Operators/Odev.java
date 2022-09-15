package day_6_Operators;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*  Ödev 1 : Yarıçapı kullanıcan alarak;
        - Dairenin alanı
        - Dairenin çevresi
        PI:3.14
        */
        final double PI=3.14;

        System.out.print("Yarı Çapı girin: ");
        double r=scan.nextDouble();

        double alan=PI*r*r;
        double cevre=(PI*r)*2;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        System.out.println("------");

        /* Ödev 2: Kullanıcıdan Fahrenheit değeri alarak Celsius değerini yazdırın.
        c=(f-32)/1.8
         */

        System.out.print("Fahrenheit Değerini girin: ");
        double f=scan.nextInt();

        double c=(f-32)/1.8;
        System.out.println("Celsius: " +c);

        System.out.println("-----");

        // Ödev 3:

        System.out.print("Toplantıya katılan sayısını giriniz: ");
        int katilan=scan.nextInt();

        System.out.print("Toplantı salonundaki sıra sayısını giriniz: ");
        int sira=scan.nextInt();

        System.out.print("Her sıradaki koltuk sayısını giriniz: ");
        int koltuk=scan.nextInt();

        int kapasite=koltuk*sira;
        int bosKoltuk=kapasite-katilan;
        int kacSiraDolu=(katilan/sira)+1;
        int kacSiraBos=koltuk-kacSiraDolu;
        int siraBosKoltuk=sira-(katilan%sira);

        System.out.println("Toplam kapasite: " + kapasite);
        System.out.println("Boş koltuk sayısı: " + bosKoltuk);
        System.out.println("Oturulan sıra sayısı: " + kacSiraDolu);
        System.out.println("Tamamen boş sıra sayısı: " + kacSiraBos);
        System.out.println("Oturulan sıradaki boş koltuk sayısı: " + siraBosKoltuk);

        // Ödev 4 : Saniye değeri girerek saat, dakika ve saniye yazdırın

        System.out.print("Saniye değeri giriniz: ");
        int saniyeDegeri= scan.nextInt();

        int saat = saniyeDegeri/3600;
        int dakika= (saniyeDegeri%36007)/60;
        int saniye = saniyeDegeri%60;

        System.out.println("Saat: " + saat + " Dakika: " + dakika + " Saniye: " + saniye);



    }
}

