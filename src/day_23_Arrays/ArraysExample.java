package day_23_Arrays;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {


        // int[] ola=new int[3];
        // ola[0]=2;
        // ola[1]=4;
        // ola[2]=5;

//        System.out.println(ola[0]);
//        System.out.println(ola[1]);
//        System.out.println(ola[2]);

        // for (int i=0; i<3;i++){

        // System.out.println(ola[i]);
        // System.out.println(ola[i]*ola[i]);       // karesi alındı


        // Bir array oluşturun ve Haftanın günlerini bu array’in içine kaydedin.


//        String[] haftaninGunleri=new String[7];
//        haftaninGunleri[0]="Pazartesi";
//        haftaninGunleri[1]="Salı";
//        haftaninGunleri[2]="Çarşamba";
//        haftaninGunleri[3]="Perşembe";
//        haftaninGunleri[4]="Cuma";
//        haftaninGunleri[5]="Cumartesi";
//        haftaninGunleri[6]="Pazar";

        // System.out.println("Bugün günlerden " + haftanınGunleri[2]);

       /* for (int i=0; i<7; i++){              // haftanın günlerini yazdırın
          System.out.println("Bugün günlerden " + haftaninGunleri[i]);
       } */

/*
        for (int i=0; i<7; i++) {
            if (haftaninGunleri[i].equalsIgnoreCase("cuma")) {
                System.out.println("true");
                break;
            } else {
                if (i == 6) {
                    System.out.println("false");
                }
            }
            */
        String isim = "ahmet";
        String str[] = {"AAA", "SSS", "İLYAS", "EEE", "FFF"};

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (str[i].equalsIgnoreCase(isim)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("vardır");
        } else {
            System.out.println("yoktur");
        }

        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println(x);

        System.out.println("---------------");

        // 20 boyutunda bir dizi oluşturun ve her bir index’ine random 0 ile 100 arasın bir değer
        //atayın. Sonrasında 17 index numarasındaki veriyi ekrana yazdırın.

        // çift sayılar ve tek sayılar kaç adettir.


        int[] sayi = new int[20];
        int tek = 0, cift = 0;

        for (int i = 0; i < 20; i++) {
            sayi[i] = random.nextInt(100);
            System.out.println((i + 1) + " sayi : " + sayi[i]);
            if (sayi[i]%2==0){
                cift++;
            }else {
                tek++;
            }
        }
        System.out.println("17. indexdeki sayımız " + sayi[17] );
        System.out.println("tek sayı : "+tek);
        System.out.println("çift sayı : "+cift);



    }
}
