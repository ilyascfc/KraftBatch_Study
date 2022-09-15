package day_21_22_String_Class;

public class Lab2 {
    public static void main(String[] args) {
        //1 System.out.println(firstThree("ilyas"));
        //2 System.out.println(boslukKaldir("mer ha ba"));
        //3 System.out.println(ikinciYari("deneme"));
        //4 System.out.println(changeWord("merhaba"));
        //5 System.out.println(repeatThree("adan"));
        //6 System.out.println(harfSayisi("Ankara","A"));
        //6 System.out.println(kelimeSayisi("ankaran", "ank"));
        //7 System.out.println(harfTemizligi("anakara", "a"));
        //8 System.out.println(controlSentence("merhaba dünya", "aba"));
        //9 System.out.print(shortLong("ali", "mehmet"));
        // System.out.println(soru10("istanbul"));
        // System.out.println(soru11("ankaran"));
        // System.out.println(soru12("ilyas yılmaz  "));   // tekrar izle yapamadım.
        // System.out.println(soru13("Ananas"));            // yapıldı
        // System.out.println(soru14("denemene"));          // yapıldı
        // System.out.println(soru15_1("ilyas çifçi"));     // yapıldı kopya çekerek
        // System.out.println(soru16("gsdfgdf"));           // yapıldı
        // System.out.println(soru17("deneme nerde"));      // yapıldı
        // System.out.println(soru18("sevmesev"));          //olmadı
        // System.out.println(soru19());
        // System.out.println(soru20());
        // System.out.println(soru21());
        // System.out.println(soru22());
        // System.out.println(soru23());
        // System.out.println(soru24());
        // System.out.println(soru25());
        // System.out.println(soru26());
        // System.out.println(soru27());
        // System.out.println(soru28());
        // System.out.println(soru29());
        // System.out.println(soru30("msnljd 1 11 2 "));

    }

    // Soru 1
    // Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 harfden az
    // ise inputu döndüren bir metot yazınız.
    // Merhaba    //Mer    //Ali Ali
    public static String firstThree(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 3);

    }

    // Soru 2
    // Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
    // Merhaba dünya    //Merhaba%dünya
    public static String boslukKaldir(String str) {
        return str.replace(" ", "%");
    }

    // Soru 3
    // Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program yazdırın.
    // Sanayagı    // yagı
    // Mutluluk    // uluk
    public static String ikinciYari(String str) {
        return str.substring(str.length() / 2);
    }

    // Soru 4
    // Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
    // alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu yazınız.
    // (Merhaba ,a, e)    //Merheba    //(Kasaba , a, i)    //Kisaba
    public static String changeWord(String str, String old, String new1) {
        String result = str.replaceFirst(old, new1);

        return result;
    }

    // Soru 5
    // Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    // Merhaba     //        MMMeeerrrhhhaaabbbaaa     // Ali    //        AAAllliii
    public static String repeatThree(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    // Soru 6
    // Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    // kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
    // Ankara,a 3    //Edirne,e 2    // bulamaz ise 0 döndürsün.
    public static int harfSayisi(String str, String target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static int kelimeSayisi(String str, String target) {
        int count = 0;
        for (int i = 0; i < str.length() - (target.length() - 1); i++) {
            if (str.substring(i, i + target.length()).equalsIgnoreCase(target)) {
                count++;
            }
        }
        return count;
    }

    // Soru 7
    // Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
    // kaldırılmış şekilde string döndüren programı yazınız.
    // (Merhaba, a)    // Merhb
    public static String harfTemizligi(String kelime, String harf) {
        return kelime.replace(harf, "");
    }

    // Soru 8
    // Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    // gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    // Kinlenmek    //true    //Kin tutmak    //true    //Ekin ektim    //true
    // Keskin ilçesinden geçiyorum     //false    //Neden kin tutuyorsun    //false
    public static boolean controlSentence(String kelime, String control) {
        if (kelime.substring(0, control.length()).equalsIgnoreCase(control) ||
                kelime.substring(1, 1 + control.length()).equalsIgnoreCase(control)) {
            return true;
        }
        return false;
    }

    // Soru 9
    // Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
    // defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    // Mehmet    //Ali
    // AliAliMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
    // hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
    // hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
    // hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
    // hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
    // hmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMehmetMe
    // hmetAliAli
    public static String shortLong(String str1, String str2) {
        String result = "";
        result += str1 + str1;
        for (int i = 0; i < 30; i++) {
            result += str2;
        }
        result += str1 + str1;

        return result;
    }

    // Soru 10
    // Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
    // altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    // Sabun Sabun    //Merhaba    //Merha    //Ali Ali..    //Hey Hey..    //Pi Pi…
    public static String soru10(String str) {
        if (str.length() >= 5) {
            return str.substring(0, 5);
        } else {
            String result = "";
            for (int i = 0; i < 5 - str.length(); i++) {
                result += ".";
            }
            return str.concat(result);
        }
    }

    // Soru 11
    // Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa
    // true    //almıyorsa false yazdırın.
    // Ankara    //false    //Kafka    //true    //Salsa    //true    //Saksı    //false
    public static boolean soru11(String str) {
        String str1 = str.toLowerCase();  // hepsi küçük yap
        return str.substring(0, 2).equals(str1.substring(str1.length() - 2));

    }

    // Soru 12
    // Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
    // Ekrana "Soy isminiz ..(soyad ).. dır ." Yazan metodu
    // İnput    //: Harun Özsoy "    //Output    //: "Soy isminiz Özsoy dır ."
    // İnput    //:" Harun Kenan Özsoy "    //Output    //: "Soy isminiz Özsoy dır ."
    // İnput    //: Harun Kenan Can Özsoy "    //Output    //: "Soy isminiz Özsoy dır ."
    // İnput    //:" Harun Kenan Can Sami Özsoy "    //Output    //: "Soy isminiz Özsoy dır ."
    public static String soru12(String str) {
        String str1 = str.trim();
        return str1.substring(str1.lastIndexOf(10) + 1);
    }

    // Soru 13
    // Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    // çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
    // Merhaba    //Merhab    //Ananas    //Anas
    public static String soru13(String str) {
        String result = "";
        while (!str.isEmpty()) {                                 // boş değilse gir
            result += str.charAt(0);                              // ilk karakteri aldı
            str = str.replace(str.substring(0, 1), "");  // ilk karaktere eşit olanları sildi
        }
        return result;
    }

    // Soru 14
    // Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string olarak
    // return eden methot yazınız.    //" Java "    //output:a    //"    //Javva " output:av
    // " Derslerime    //cok calisiyorum " output:erslimco
    public static String soru14(String str) {
        str = str.replace(" ", "");
        String result = "";
        while (!str.isEmpty()) {
            if (str.substring(1).contains(str.substring(0, 1))) {
                result += str.substring(0, 1);
            }
            str = str.replace(str.substring(0, 1), "");
        }
        return result;
    }

    // Soru 15
    // Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    // ayrı ayrı ekrana yazan programı yazınız.
    // Ankara ünlü harfler=Aa    //Ünsüz harfler=nkr

    public static String soru15_1(String str) {
       StringBuilder sesli=new StringBuilder();
        String unluHarfler ="aeiıoöuüAEIİOÖUÜ";
       for (int i=0;i<str.length();i++) {
           if (unluHarfler.indexOf(str.charAt(i)) != -1)
               sesli.append(str.charAt(i));

       }

        for (int i=0;i<str.length();i++){
           if (unluHarfler.indexOf(str.charAt(i))==-1)
           sesli.append(str.charAt(i));
       }
        return sesli.toString();
    }

    // Soru 16
    // Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
    // harfini kelimeden keserek sonuna ekleyin.
    // Merhaba    //habaMer    //Ali Ali

    public static String soru16(String str) {
        if (str.length() > 3) {
            return str.substring(3) + str.substring(0, 3);
        }
        return "Kelime minumum 3 hafrten oluşmalıdır.";
    }

    // Soru 17
    // Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
    // harfini kelimeden keserek kelimenin başına ekleyin.
    // Merhaba    //abaMerh    //Ali Ali

    public static String soru17(String str) {
        if (str.length() > 3) {
            return str.substring(str.length()-3) + str.substring(0, str.length()-3);
        }
        return "Kelime minumum 3 hafrten oluşmalıdır.";
    }


    // Soru 18
    // Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
    // küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
    // ikazı versin.
    // Merhaba M    //Araba r    //Karkas rotası o

    public static String soru18(String str1) {

        return "";
    }

    // Soru 19
    // Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
    // eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
    // yazdırın. (anagram kelime ise)
    // İftar    //Tarif true    //Zehra    //Ezhar true    //Nefes    //Enfes true
    // Selcuk    //Elyase false

    public static String soru19(String str1) {

        return "";
    }

    // Soru 20
    // Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu yazın.
    // aabccccseeeeeefff    //acef    //abaccb    //c
    // Arsız ardı ardına tekrar eden harf yoktur
    // amannsız    //n

    public static String soru20(String str1) {

        return "";
    }

    // Soru 21
    // Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
    // girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    // Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
    // giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat () metodu ile
    // birleştirerek yazdırın.
    // Slm    //Ali    //Slm    //Ali

    public static String soru21(String str1) {

        return "";
    }

    // Soru 22
    // Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük küçük
    // harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur ikazı versin.
    // Merhaba M    //Araba r    //Karkas rotası o

    public static String soru22(String str1) {

        return "";
    }

    // Soru 23
    // Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise true
    // değil ise false döndüren metot yazınız.
    // Kabak    //true    //Nalan    //true    //Ara    //true    //talat    //true
    // Kasaba    // false    //ahmet    //false

    public static String soru23(String str1) {

        return "";
    }

    // Soru 24
    // Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
    // true değil ise false döndüren metot yazınız.
    // Kabak    //true    //Nalan    //true    //Ara    //true    //talat    //true
    // Kasaba    //false    //ahmet    //false

    public static String soru24(String str1) {

        return "";
    }

    // Soru 25
    // Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu ekrana yazdırın.
    // Seni seviyorum 1    //Sevmek veya sevmemek 2    //Sev seni seveni , sevmek güzeldir. 3

    public static int soru25(String str) {
        int sayac=0;
        String kelime="sev";
        for(int i = 0 ; i<=str.length()-1;i++)
        {
            for(int j= 0 ; j<=7;j++)
            {
                if(str.charAt(i)==kelime.charAt(j))
                {
                    sayac++;
                }

            }

        }

        return sayac;
    }

    // Soru 26
    // Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı
    // sayılarda dönüyorsa false yazdıran metodu yazınız.
    // Ankara ile Bursa arası 500 km. True
    // Ankara Bursa kadar yeşil değil. Bursa bir başka.    //False
    // İstanbul çok uzak    //false

    public static String soru26(String str1) {

        return "";
    }

    // Soru 27
    // Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
    // döndüren metodu yazdırın.
    // Kullanacak    //true    //Zamlanacak    //true    //Farkındalık    //false    //Farkında    //false

    public static String soru27(String str1) {

        return "";
    }

    // Soru 28
    // Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
    // yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
    // Merhaba 1m1e1r1h2a1b    //Seni seviyorum 2s2e1n2i1v1y1o1r1u1m

    public static String soru28(String str1) {

        return "";
    }

    // Soru 29
    // Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
    // Merhaba a    //aaaaaaabbcccc    //a    //eeemmmsssssssssshhhhhhhhhsss    //s

    public static String soru29(String str1) {

        return "";
    }

    // S0ru 30
    // Yazılan kelimenin içerisinde sayıları yazdıran metodu yazınız.
    // merha123     123     // 123a23ff34   1232334
    public static String soru30(String str) {              // ASCI tablosu
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                result += str.charAt(i);
            }
        }
        return result;
    }

}
