package day_29;

public class VarArgs {
    public static void main(String[] args) {
        sum(5, 3, 4, 6);
        sum(5, 31, 4, 6);
        sum(5, 3, 44, 6);
        concat("java"," ","seviyorum");
        System.out.println(concat1("ilyas", "çifçi"));
    }

    public static void sum(int... sayilar) {
        int sum = 0;
        for (int i : sayilar) {
            sum += i;
        }
        System.out.println("Girilen " + sayilar.length + "sayının Toplamı :" + sum);
    }
    public static void concat(String... strs){
     String empty="";
     for (String s:strs){
         empty+=s;
     }
        System.out.println(empty);
    }
    public static String concat1(String... strs){
        String empty="";
        for (int i=0; i<strs.length; i++){
            empty+=strs[i].charAt(0);
        }
        return empty;
    }
}