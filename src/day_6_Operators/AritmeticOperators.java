package day_6_Operators;

public class AritmeticOperators {
    public static void main(String[] args) {

        int x = 19, y = 6, z;
        z = x % y;
        System.out.println(z);
        System.out.println("-------------");
        int sayi =35+12/(5/2)*4%(12-9);
        System.out.println(sayi);
        System.out.println("-------");

        int yas=2022-1990;
        System.out.println(yas);

        System.out.println("_______");

        int aliYas=2022-1990;
        int ahmetYas=aliYas-5;
        System.out.println(ahmetYas);

        System.out.println("alan");
        System.out.println("_____");

        double fahrenheit=300;
        double c=(fahrenheit-32)/1.8;
        System.out.println(c);

        double fizik=92, kimya=55, mat=89;
        double ort=(fizik+kimya+mat)/3;
        boolean sonuç = ort>80;

        System.out.println(sonuç);
        System.out.println(ort);
        System.out.println("_____");

        /* int sira, koltuk, katilımcı, kapasite;
        sıra=15;
        koltuk=12;
        katılımcı=113;
        kapasite = sıra * koltuk;
        int boşkoltuk = kapasite-katılımcı;
        int oturulanSıra =(kapasite/koltuk)+1;
        int boşSıra = sıra-oturulanSıra;
        int boşKoltuk2 = (koltuk-(katılımcı%koltuk);*/

        int saniye=31502;
        int saat=saniye/3600;
        int dakika=(saniye);

        System.out.println("Saat :" + saat);










    }
}
