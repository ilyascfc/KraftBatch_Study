package Odevler;

import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {

        // km birim fiyatı 0.10$
        // 12 yaşından küçükse % 50 indirim
        // 12 ve 24 arasındaysa % 10 indirim
        // 65 yaş üstü ise % 30 indirim
        // gidiş dönüş alırsa % 20 indirim

        Scanner sc = new Scanner(System.in);
        int km, yas, tip;
        System.out.print("Mesafe Giriniz :");
        km= sc.nextInt();
        System.out.print("Yaşı Giriniz :");
        yas= sc.nextInt();
        System.out.print("Bilet Tipi (Tek Yön=1 - Gidiş/Dönüş=2 seçiniz : ");
        tip= sc.nextInt();
        System.out.println();

        double fiyat, yasIndirimi, tipIndirimi;

        if (km>0 && yas>0 && (tip==1 || tip==2)){
            fiyat=km*0.10;
            if (yas<12){
                yasIndirimi=fiyat*0.5;
            } else if (yas>=12 && yas<=24) {
                yasIndirimi=fiyat*0.1;
            }else if (yas>65){
                yasIndirimi=fiyat*0.3;
            }else {
                yasIndirimi=0;
            }
        fiyat-=yasIndirimi;
            if (tip==2){
                tipIndirimi=fiyat*0.2;
                fiyat=(fiyat-tipIndirimi)*2;
            }
            System.out.println("Bilet Fiyatınız :"+fiyat +"$");
        }else{
            System.out.println("Girişlerde hata var");
        }




    }

}
