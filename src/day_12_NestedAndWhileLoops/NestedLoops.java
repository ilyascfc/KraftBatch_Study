package day_12_NestedAndWhileLoops;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        //111111
        //111111


        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print("1");
            }
            System.out.println();
        }


        // Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız kulanarak)
        //*
        //**
        //***


        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız kulanarak)
        //******
        //*****


        for (int i = 6; i >= 1; i--) {
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        //1
        //12
        //123
        //1234
        //12345
        //123456


        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        //1
        //22
        //333
        //4444
        //55555
        //666666


        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        //Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        //Ödev: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        //       *
        //      * *
        //     * * *
        //    * * * *
        //   * * * * *
        //  * * * * * *

        int i, j, k;//Değişekenlerimizi tanımladık.
        for (i = 1; i < 6; i++) {//Döngümüzün ne kadar döneceğini belirtir.
            for (j = i; j < 6; j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (k = 1; k <= i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }





    }

}