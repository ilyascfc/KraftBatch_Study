package day_21_Strin_Class;

public class Lab2 {
    public static void main(String[] args) {
        // System.out.println(firstThree("ilyas"));
        // System.out.println(boslukKaldir("mer ha ba"));
        // System.out.println(ikinciYari("deneme"));
        // System.out.println(changeWord("merhaba"));
        // System.out.println(repeatThree("adan"));
        // System.out.println(harfSayisi("Ankara","A"));
        // System.out.println(kelimeSayisi("ankaran", "ank"));
        // System.out.println(harfTemizligi("anakara", "a"));
        System.out.println(controlSentence("merhaba dünya", "aba"));


    }

    // Soru 1
    // Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 harfden az
    //ise inputu döndüren bir metot yazınız.
    //Merhaba    //Mer    //Ali Ali
    public static String firstThree(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 3);

    }

    // Soru 2
    // Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
    //Merhaba dünya    //Merhaba%dünya

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
    //(Merhaba ,a, e)    //Merheba    //(Kasaba , a, i)    //Kisaba

    public static String changeWord(String str, String old, String new1) {
        String result = str.replaceFirst(old, new1);

        return result;
    }

    // Soru 5
    // Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    // Merhaba     //        MMMeeerrrhhhaaabbbaaa     // Ali    //        AAAllliii

    public static String repeatThree(String str) {
        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j=0; j<3; j++){
                result=result+str.charAt(i);
            }
        }
        return result;
    }

    // Soru 6
    // Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    //kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
    //Ankara,a 3    //Edirne,e 2    // bulamaz ise 0 döndürsün.

    public static int harfSayisi(String str, String target){
        int count=0;
        for (int i=0; i<str.length(); i++){
                       if (str.substring(i,i+1).equals(target)){
                count++;
            }
        }
        return count;
    }

    public static int kelimeSayisi(String str, String target){
        int count=0;
        for (int i=0; i<str.length()-(target.length()-1); i++){
            if (str.substring(i,i+target.length()).equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }

    // Soru 7
    // Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
    // kaldırılmış şekilde string döndüren programı yazınız.
    // (Merhaba, a)    // Merhb

   public static String harfTemizligi(String kelime, String harf){
        return kelime.replace(harf, "");
   }

    // Soru 8
    // Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    //gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    //Kinlenmek    //true    //Kin tutmak    //true    //Ekin ektim    //true
    //Keskin ilçesinden geçiyorum     //false    //Neden kin tutuyorsun    //false

    public static boolean controlSentence(String kelime, String control){
        if (kelime.substring(0,control.length()).equalsIgnoreCase(control) ||
        kelime.substring(1,1+control.length()).equalsIgnoreCase(control)){
            return true;
        }
        return false;
    }



}
