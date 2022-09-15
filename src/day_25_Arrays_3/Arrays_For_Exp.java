package day_25_Arrays_3;

import java.util.Arrays;

public class Arrays_For_Exp {
    public static void main(String[] args) {
        System.out.print("---split :");
        String str = "Merhaba Java İnsanları";
        String[] arry = str.split(" ");
        arry[1] = "yurdum";

        System.out.println(arry[0]);
        System.out.println(arry[1]);

        System.out.println(Arrays.toString(arry));

        System.out.print("---copyOfRange :");

        int[] arrys = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ints = Arrays.copyOfRange(arrys, 2, 6);
        System.out.println(Arrays.toString(ints));

        System.out.print("---sort :");

        Arrays.sort(arrys);
        System.out.println(Arrays.toString(arrys));

        System.out.print("---Fill :");

        Arrays.fill(arrys, 10);
        System.out.println(Arrays.toString(arrys));

        System.out.print("---Soru 1 :");
        String str1 = "merhaba java insanları bugün nasılsınız";
        System.out.println(Arrays.deepToString(soru1(str1)));


        System.out.print("---Soru 2 :");
        String str2 = "kayısı, armut, üzüm, çilek, na";
        System.out.println(Arrays.toString(soru2(str2)));

        System.out.print("---Soru 3 :");
        String str3 = "elma, armut, üzüm, çilek, nar";
        System.out.println(Arrays.toString(soru3(str3)));

        System.out.print("---Soru 4 :");
        String str4 = "merhaba java insanları bugün nasılsınız";
        System.out.println(Arrays.toString(soru4(str4)));

        System.out.print("---Soru 5 :");
        // System.out.println(Arrays.toString(soru5()));  // tekrardan izle
        System.out.print("---Soru 6 :");
        int[] sayılar = {1, 33, 48, 37, 4, 5};
        System.out.println(aritmetic(sayılar));
        System.out.print("---Soru 7 :");
        System.out.println(Arrays.toString(fillWith(sayılar)));
        System.out.print("---Soru 8 :");
        System.out.println(Arrays.toString(fillWith2(sayılar)));


        System.out.println("----------The End----------");
    }
    // Soru 1 «merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
    //element olacak şekilde bir array a dönüştüren bir method yazın.
    public static String[][] soru1(String str) {
        String[] arr = str.split(" ");
        String[] arr1 = Arrays.copyOfRange(arr, 0, 3);
        String[] arr2 = Arrays.copyOfRange(arr, 3, 5);
        String[][] forReturn = {arr1, arr2};
        return forReturn;
    }
    // Soru 2 «kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
    //varsa onun yerine armut atayın.
    public static String[] soru2(String str2) {
        String[] split = str2.split(", ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() < 5) {
                split[i] = "çilek";
            }
        }
        return split;
    }

    // Soru 3 «elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.
    public static String[] soru3(String str3) {
        String[] split = str3.split(", ");
        String temp = split[0];
        split[0] = split[split.length - 1];
        split[split.length - 1] = temp;

        return split;
    }

    // Soru 4 «merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
    //harflerinden bir döndüren method yazın.
    public static String[] soru4(String str4) {
        String[] yeniKelime = str4.split(" ");
        return yeniKelime[1].split("");
    }

    // Soru 5 Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
    //biçimde bir array içine yerleştirsin. n = 5 Exm : [0,1,2,3,4]
    public static int[] soru5(int n) {
        int[] yeni = new int[n];
        for (int i = 0; i < n; i++) {
            yeni[i] = n;
        }
        return yeni;
    }

    // Soru 6 Bir sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını
    //veren bir method yazın.
    public static int aritmetic(int[] arr) {
        Arrays.sort(arr);
        return (arr[0] + arr[arr.length - 1]) / 2;
    }

    // Soru 7 Bir sayı dizisinin en küçük elemanı ne ise sayı dizisini onunla dolduran bir
    //method yazın.
    public static int[] fillWith(int[] arr) {
        Arrays.sort(arr);
        Arrays.fill(arr, arr[0]);
        return arr;
    }

    // Soru 8 Bir sayı dizisinin en küçük harfi ne ise sayı dizisini (en büyük değer hariç)
    //onunla dolduran bir method yazın.
    public static int[] fillWith2(int[] arr) {
        Arrays.sort(arr);
        Arrays.fill(arr, 0, arr.length - 1, arr[0]);
        return arr;
    }


}















