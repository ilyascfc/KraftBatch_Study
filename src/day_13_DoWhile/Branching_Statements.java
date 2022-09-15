package day_13_DoWhile;

import java.util.Scanner;

public class Branching_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Örnek : Sonsuz bir While döngüsü içerisine kullanıcıdan 2 sayı isteyin ve toplamını ekrana
        //yazdırın sayı toplamı 50 ye eşit ise proramdan çıkış işlemi gerçekleştirin.

        /*
        boolean k=true;
        while (true){
            System.out.println("toplamları 50");
            System.out.println("1.sayı :");
            int a= sc.nextInt();
            System.out.println("2.sayı :");
            int b= sc.nextInt();
            System.out.println("toplam : "+ (a+b));
            if ((a+b)==50){
            break;

            }
        } */

        //Örnek : Nested loop kullanarak kullanıcıdan hangi işlemi yapmak istediğini sorun.
        // 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
        // kullanıcının isteğine göre işlem yapın.
        // Kullanıcının seçimine göre Girilen ekrandan 2 sayı alın
        // işlemin sonucunu ekrana yazın çıkmak sonuç
        //0 ise çıkış ilemi yapılacağını kullanıcıya bildirin.

        /*
        while (true) {
            System.out.println("ne yapmak istiyorsun");
            System.out.println("1 Toplama\n 2 Çıkarma\n 3 Çarpma\n 4 Bölme\n 5 Çıkış");

            System.out.print("seçiniz :");
            int i = sc.nextInt();

            if (i == 1) {
                while (true) {

                    System.out.print("Toplama İşlemi (Toplam 0 eşit ise çıkar)");
                    System.out.print("1. Sayı :");
                    int a = sc.nextInt();
                    System.out.print("2. Sayı :");
                    int b = sc.nextInt();
                    System.out.print("Toplam :" + (a + b));
                    if ((a + b) == 0) {
                        break;
                    }

                }

            }
        } */

        /*
        for (int i=0; i<10; i++){
            if (i>5 && i<8){
                continue;
            }
            System.out.print(" " +i);
        }

         */




    }
}