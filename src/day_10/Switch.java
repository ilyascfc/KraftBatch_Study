package day_10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Kaçıncı Ay :");

        int numOfMounth=sc.nextInt();
        switch (numOfMounth){
            case 1:
                  System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Girilen sayı bir ay ifade etmiyor.");




        System.out.println("Hangi Gün :");
        int gunler = sc.nextInt();
        switch (gunler) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Girilen sayı bir gün ifade etmiyor.");



        int beden = 60;
        switch (beden) {
            case 38,40,42:
                System.out.println("small beden");
                break;
            case 44,46,48:
                System.out.println("medium bedem");
                break;
            case 50,52,54:
                System.out.println("large beden");
                break;
            default:
                System.out.println("bedenin kontrol ettir");


        3 katlı bir motel in
        1. katında Resepsion, Güvenlik ve Oda hizmetler var.
        2 katında Yemekhane, Dinlenme salonu ve Room1,Room2
        3.katında ise Room3,Room4,Room5,Room6 vardır.
        Bir switch yapısı ile otel katlarını ve oda isimlerini girerek tanıtım alacagınız bir program(nested
        switch) yazın. Tanıtım bilgileri için aşağıdakileri kullanabilirsiniz.
        message 1 : lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.
        message 2 : 1.kat : Resepsion-Güvenlik-Oda hizmetleri
        2.kat : Yemekhane-Dinlenme salonu-Room1-Room2
        3.kat : Room3-Room4-Room5-Room6
        Resepsion : tüm işlemleriniz için bekleriz
        Güvenlik : profosyonel bir hizmettir
        Oda hizmetleri : temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz
        Yemekhane : Kahvaltı 08-11
        Öğle yemeği 12-15
        Akşam yemeği 18-21
        Dinlenme salonu : 24 saat çay servisi ile hizmetinizdedir
        Room1,Room2 : ekonomik oda
        Room3,Room4 : standart oda
        Room5,Room6 : özel oda
         */

        System.out.println("lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.");
        System.out.println("1.kat : Resepsion-Güvenlik-Oda hizmetleri\n2.kat : Yemekhane-Dinlenme salonu-Room1-Room2\n3.kat : Room3-Room4-Room5-Room6 ");

        int kat= sc.nextInt();
        sc.nextLine();
        String secim= sc.nextLine();

        switch (kat){
            case 1:
                switch (secim){
                    case "Resepsion":
                        System.out.println("tüm işlemleriniz için bekleriz");
                        break;
                    case "Güvenlik":
                        System.out.println("profosyonel bir hizmettir");
                        break;
                    case "Oda hizmetleri":
                        System.out.println("temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz");
                        break;
                    default:
                        System.out.println("böyle bir oda yok");

                }
                break;
            case 2:
                switch (secim){
                    case "Yemekhane":
                        System.out.println("Kahvaltı 08-11\n" +
                                "        Öğle yemeği 12-15\n" +
                                "        Akşam yemeği 18-21");
                        break;
                    case "Dinlenme salonu":
                        System.out.println("24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case "Room1-Room2":
                        System.out.println("ekonomik oda");
                        break;
                    default:
                        System.out.println("böyle bir oda yok");


                }
                break;
            case 3:
                switch (secim){
                    case "Room3-Room4":
                        System.out.println("standart oda");
                        break;
                    case "Room5-Room6":
                        System.out.println("özel oda");
                        break;
                    default:
                        System.out.println("böyle bir oda yok");
                }
                break;
            default:
                System.out.println("otel 3 katlı");

        }
    }
}
