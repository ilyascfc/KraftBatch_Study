package day_24_Arrays_2;
import java.util.*;
public class Arrays_Exp {
    public static void main(String[] args) {
       int[] iArry = new int[5];
       iArry[0]=10;
       iArry[1]=11;
       iArry[2]=12;
       iArry[3]=13;
       iArry[4]=14;

       for (int i:iArry){                        // for each Loop
           System.out.println(i);
       }
        System.out.println("------------");

       for (int i=0; i<iArry.length; i++){      // for Loop
           System.out.println(iArry[i]);
       }
        System.out.println("------------");

       String [] sArry=new String[3];
       sArry[0]="ilyas";
       sArry[1]="ahmet";
       sArry[2]="zeynep";

        System.out.println(sArry[0].length());      // ilyas karakter sayısını verdi.

        System.out.println("------------");

        System.out.println(Arrays.toString(sArry));


    }       // main
}           // class
