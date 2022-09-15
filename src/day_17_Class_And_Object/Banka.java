package day_17_Class_And_Object;

import java.util.Random;
import java.util.Scanner;

public class Banka {
    int hesapNo;
    String musteriAdSoyad;
    double paraMiktari;
    boolean mobilBankacilik;

    public void hesapAc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("İsim :");
        musteriAdSoyad = scan.nextLine();
        Random random = new Random();
        hesapNo = random.nextInt(10000);
        System.out.println(musteriAdSoyad + " " + hesapNo + " no.lu hesabınız başarıyla oluşturlmuştur. ");

    }

    public void mobilBankacilikOnay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mobil Bankacılık kullanmak için lütfen evet yazınız :");
        String onay = scan.next();
        if (onay.equals("evet") || onay.equals("Evet") || onay.equals("EVET")) {
            mobilBankacilik = true;
            System.out.println("Sayın " + musteriAdSoyad + " Mobil Bankacılık kullanabilirsiniz");
        } else {
            System.out.println("Sayın " + musteriAdSoyad + " mobil bankacılığa giriş yapamazsınız");
        }


    }

    public void paraYatir(double para) {
        paraMiktari+=para;

    }
    public void hesapOzeti(){
        System.out.println(musteriAdSoyad+" "+hesapNo+" nolu hesabınzda "+ paraMiktari+ " TL vardır.");

    }






}
