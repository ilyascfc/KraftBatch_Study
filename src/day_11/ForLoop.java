package day_11;

public class ForLoop {
    public static void main(String[] args) {
       /* for (int i=1; i<=20;i++){
            System.out.println(i+"- Merhaba Dünya");
        }

        for (int a=0; a<100; a++){
            System.out.println(a);
        }
        for (int i=15; i<100; i++){
            System.out.print(i+" ");
        }

        for (int a=100; a>0; a--){
            System.out.print(a+ " ");
        }

        for (int i = 0; i < 100; i += 2) {
            System.out.print(i + " ");
        }
// Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları
//ekrana yazdırın.

        for (int i=10; i<=1000; i+=10){
            System.out.print(i+ " ");
        }

        // Örnek: 6 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1

        int sonuc = 1;
        for (int i=6; i>0; i--){
            sonuc*=i;
        }
        System.out.println(sonuc);

        int sonuc=1;
        for (int i=1; i<=6; i++){
            sonuc=sonuc*i;
        }
        System.out.println(sonuc);

        // Örnek: 0 ile 20 arasındaki tüm sayılarının küpleri alarak ekrana
        //yazdırın.

        Scanner sc=new Scanner(System.in);
        for (int i=0; i<20; i++){
            int sonuc;
            sonuc=i*i*i;
            System.out.println(i+ sonuc);


        // Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit
        //değerlerini ekrana yazdırın. (C=(F-32) / 1.8

        for(double c=24; c<50; c++){
            double sonuc=(c*1.8)+32;
            System.out.println(c+"º" +sonuc);
            }


// Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini
//sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
//ekrana yazdırın.


        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen bir kelime yazınız :");
        String kelime=sc.nextLine();
        System.out.print("Ekrana kaç defa yazılsın : ");
        int sayi=sc.nextInt();

        for (int i=0; i<sayi; i++){
            System.out.println(kelime);
        }



        //Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        //girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        //olan tamsayıların toplamını ekrana yazdıran programı yazınız.

        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen 0 ile 1000 arasında bir sayı yazınız :");
        int sayi=sc.nextInt();

        int sonuc=0;
        for (int i=0; i<=sayi; i++){
            sonuc+=i;
        }
        System.out.println(sonuc);



        //Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        //girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        //tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
        //yazınız

        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen 0 ile 1000 arasında bir sayı yazınız :");
        int sayi=sc.nextInt();

        int tekSayi=0;
        int ciftSayi=0;

        for (int i=0; i<=sayi; i++){
            if(i%2==0){
                ciftSayi+=i;
            } else {
                tekSayi+=i;
            }
        }
        System.out.println(tekSayi);
        System.out.println(ciftSayi);



        //Örnek: Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu
        //yazdıran programı yazdırınız.(2 üzeri 4 =16

        Scanner sc=new Scanner(System.in);
        System.out.print("taban giriniz :");
        int taban=sc.nextInt();
        System.out.print("kuvvet giriniz :");
        int kuvvet=sc.nextInt();

        int sonuc=1;
        for (int i=0; i<kuvvet; i++){
            sonuc*=taban;
        }
        System.out.println(sonuc);

        */



    }
}