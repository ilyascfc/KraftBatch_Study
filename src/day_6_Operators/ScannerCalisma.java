package day_6_Operators;

import java.util.Scanner;

public class ScannerCalisma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

      /*  System.out.print("Fizik: ");
        double fizik=scan.nextInt();

        System.out.print("Kimya: ");
        double kimya=scan.nextInt();

        System.out.print("Matematik: ");
        double matematik=scan.nextInt();

        double ort=(matematik+fizik+kimya)/3;

        System.out.println("Ortalama : " + ort);

       */

        System.out.print("Kimya dersi Quiz notunu giriniz: ");
        double quiz= scan.nextInt();

        System.out.print("Kimya dersi Yarı Final notunu giriniz: ");
        double yariFinal= scan.nextInt();

        System.out.print("Kimya dersi Final notunu giriniz: ");
        double finall= scan.nextInt();


        double yilSonuNotu=(quiz*0.20+yariFinal*0.30+finall*0.5);
        System.out.println("Yıl Sonu Notunuz: " + yilSonuNotu);


    }
}
