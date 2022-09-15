package day_20;

public class stringMethotsCont {
    public static void main(String[] args) {
lastThree("ilyas");

    }


    public static void lastThree(String str){
        String holder ="";
        for (int i=0; i<5; i++){
            holder += str.substring(str.length()-3);
        }
        System.out.printf(holder);


        }
    }
