package day_13_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();


        //Örnek: Kullanıcıdan devamlı sayı isteyen ve bu sayıları toplayan
        //programı yazınız. Kullanıcı 0 girdiğinde programdan çıkması
        //sağlanmalıdır.

        /*
        do {
            System.out.println("Toplam 0 ise çıkış olacak");
            System.out.print("1. Sayı :");
            int a= sc.nextInt();
            System.out.print("2. Sayı :");
            int b= sc.nextInt();
            System.out.println("toplam :" +(a+b));
            if (a+b==0){
                break;
            }

        }while (true);

        */

        //Ödev: Random sınıfını kullanarak bilgisayarınızdan 0 ile 50 arasında
        //random bir sayı almasını sağlayın ve bu sayıyı 5 defa deneme
        //yaparak bulmaya çalışın. Bu esnada bilgisayar aşağı yukarı şeklinde
        //size ipucu versin

       int i= random.nextInt(50);
        System.out.println(i);
        System.out.println("tutulan sayıyı bulunuz :");
        int j=1;

        do {
            System.out.println(j+ "Tahmin: ");
            int tahmin= sc.nextInt();
            if (tahmin==i){
                System.out.println("sayıyı buldun");
                break;
            }else if (tahmin>i){
                System.out.println("aşağı");
            }else {
                System.out.println("yukarı");
            }
            j++;
        }while (j<6);











    }
}
