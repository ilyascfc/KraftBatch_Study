package day_12_NestedAndWhileLoops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       /*
        int i=0;
        while (i<20){
            System.out.println("merhaba dünya");
            i++;
        } */

        /*
        int i=0;
        while (i<100){
            System.out.print(i+ " ");
            i++;
        } */

        /*
        int i=15;
        while (i<100){
            System.out.print(i+ " ");
            i++;
        } */

        /*
        int i=100;
        while (i>0) {
            System.out.print(i + " ");
            i--;
        } */

        /*
        int i=0;
        while (i<100) {
            System.out.print(i + " ");
            i+=2;
        } */

        /*
        int i=1;
        while (i<100) {
            System.out.print(i + " ");
            i+=2;
        } */

        /*
        int i=10;
        while (i<1000) {
            System.out.print(i + " ");
            i+=10;
        } */

        //Örnek: 8 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1)

        /*
        int i = 1, sonuc=1;
        while (i<=8) {
            sonuc *= i;
            i++
        }
        System.out.println(sonuc);

         */

        //Örnek: 0 ile 20 arasındaki 3 ün katı olan tüm sayılarının küpleri alarak
        //ekrana yazdırın.
        //0 0
        //3 27
        //9 81
        //vs

        /*
        int i=3;
        while (i<20) {
            int sonuc=i*i*i;
           System.out.println(i +"³ =" + sonuc);
            i+=3;
        }  */

        //ÖDEVVVVVVVVV
        // Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit
        //değerlerini ekrana yazdırın. (C=(F-32) / 1.8)





        //Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini
        //sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
        //ekrana yazdırın. Bu işlemi kullanıcı ‘X’ e basana kadar devam ettirin

        String exit="x";
        while (true){
            System.out.print("Lütfen Kelime Giriniz : ");
            String kelime= sc.next();
            if (kelime==exit){
                break;
            }else System.out.print("Kaç Defa Yazılsın : ");
            int tekrar= sc.nextInt();
                for (int i=0; i<tekrar; i++){
                    System.out.println(kelime);
                }
        }











    }
}
