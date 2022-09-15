package day_24_Arrays_2;

public class Tasks {
    public static void main(String[] args) {

        int[] iArr = {1, 2, 3, 4, 5, 6};
        int[] sArr = {1, 7, 8, 9, 10, 11};
        int[] cArr = {1, 55, 43, 32, 10, 11};

        // System.out.println(soru1(iArr));
        // System.out.println(soru2(iArr));
        // System.out.println(soru3(iArr,sArr));
        // System.out.println(Arrays.toString(soru4(iArr, sArr)));
        // System.out.println(Arrays.toString(soru4(iArr, sArr)));
        // System.out.println(soru5(iArr));
        // System.out.println(Arrays.toString(soru6(iArr,sArr)));
        // System.out.println(soru7(iArr));
        // System.out.println(soru8(iArr));
        // System.out.println(Arrays.toString(soru9(iArr)));
        // System.out.println(Arrays.toString(soru10(iArr)));
         System.out.println((soru11(iArr)));

    }           // main metot

    // Soru 1 Bir method yazın ve int[] kabul etsin . length i 5 den büyükse true döndürsün.
    public static boolean soru1(int[] iArr) {
        return iArr.length > 5;
    }

    // Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin
    public static boolean soru2(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == 5) {
                return true;
            }
        }
        return false;
    }

    // Soru 3 Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün
    public static boolean soru3(int[] iArr, int[] sArr) {
        return iArr[0] == sArr[0];
    }

    // Soru 4 2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün
    public static int[] soru4(int[] iArr, int[] sArr) {
        int[] newArr = new int[2];
        newArr[0] = iArr[0];
        newArr[1] = sArr[0];
        return newArr;
    }

    // Soru 5 Int arrayin elemanlarının toplamını veren bir method yazın
    public static int soru5(int[] iArr) {
        int toplam = 0;
        for (int i = 0; i < iArr.length; i++) {
            toplam += iArr[i];
        }

        return toplam;
    }

    // Soru 6 Verilen 2 arrayi birleştirip array döndüren bir method yazın.
    public static int[] soru6(int[] iArr, int[] sArr) {
        int[] newArr = new int[iArr.length + sArr.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < iArr.length) {
                newArr[i] = iArr[i];
            } else {
                newArr[i] = sArr[i - iArr.length];
            }
        }
        return newArr;

    }

    // Soru 7 İnt arryin en büyük elemanının döndüren bir method yazın
    public static int soru7(int[] iArr) {
        return iArr[0];
    }

    // Soru 8 İnt arry in en b ü y ü k elemanının dönd ü ren bir method yazın
    public static int soru8(int[] iArr) {
        int max = 0;
        for (int i = 0; i < iArr.length; i++) {
            if (max < iArr[i]) {
                max = iArr[i];
            }
        }
        return max;
    }

    // Soru 9 Bir array oluşturun ve ilk ve son elementleri swap (yer değiştirme yapın)
    public static int[] soru9(int[] iArr) {
        int temp = iArr[0];             // ilk index temp atandı
        iArr[0]=iArr[iArr.length-1];    // son index ilk index atandı
        iArr[iArr.length-1]=temp;       // son index temp saklanan index atandı
        return iArr;
    }

    // Soru 10 Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün
    public static int[] soru10(int[] iArr) {
        int[] ints = new int[iArr.length];             // aynı uzunlukta yeni bir aray tanımlandı
        for (int i=0; i<iArr.length; i++){
            ints[i]=iArr[(iArr.length-1)-i];            //
        }
        return ints;
    }
    // Soru 11 Bir methodla verilen arrayın teksayı indexin de bulunan elemanların toplamını alın
    public static int soru11(int[] iArr) {
        int toplam=0;
        for(int i=1; i<iArr.length; i+=2){
            toplam+=iArr[i];
        }
        return toplam;
    }




    }       // class


