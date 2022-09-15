package day_6_Operators;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*********************************************************");
        System.out.println("Yapmak İsteğiniz işlemin numarasnı giriniz :");
        System.out.println("1. Toplama : ");
        System.out.println("2. Çıkarma : ");
        System.out.println("3. Çarpma : ");
        System.out.println("4. Bölme : ");
        System.out.println("5. Kalan Bulma : ");
        System.out.println("*********************************************************");
        int islem = scan.nextInt();
        int sayi1, sayi2;
        if (islem == 1) {
            System.out.println("Toplama için 1.sayıyı giriniz ");
            sayi1 = scan.nextInt();
            System.out.println("Toplama için 2.sayıyı giriniz ");
            sayi2 = scan.nextInt();
            System.out.println("Toplam : " + (sayi1 + sayi2));
        } else if (islem == 2) {

            System.out.println("Çıkarma için 1.sayıyı giriniz ");
            sayi1 = scan.nextInt();
            System.out.println("Çıkarma için 2.sayıyı giriniz ");
            sayi2 = scan.nextInt();
            System.out.println("Fark : " + (sayi1 - sayi2));
        } else if (islem == 3) {
            System.out.println("Çarpma için 1.sayıyı giriniz ");
            sayi1 = scan.nextInt();
            System.out.println("Çarpma için 2.sayıyı giriniz ");
            sayi2 = scan.nextInt();
            System.out.println("Çarpım : " + (sayi1 * sayi2));
        } else if (islem == 4) {
            System.out.println("Bölme için 1.sayıyı giriniz ");
            sayi1 = scan.nextInt();
            System.out.println("Bölme için 2.sayıyı giriniz ");
            sayi2 = scan.nextInt();
            System.out.println("Bölüm : " + (sayi1 / sayi2));
        } else if (islem == 5) {
            System.out.println("Bölme için 1.sayıyı giriniz ");
            sayi1 = scan.nextInt();
            System.out.println("Bölme için 2.sayıyı giriniz ");
            sayi2 = scan.nextInt();
            System.out.println("Kalan : " + (sayi1 % sayi2));
        } else {
            System.out.println("Geçersiz İşlem!");
        }


    }
}
