package day_33_Encapsulation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        dog karabas = new dog();
        karabas.setName("selam");
        System.out.println(karabas.getName());
        System.out.println(karabas.isBlack);         // public oldugundan heryerden çağırır
        karabas.setSpeed(100);
        System.out.println(karabas.getSpeed());
        Circle circle_1 = new Circle(5);


        KraftBankCustomer ilyas = new KraftBankCustomer(1254, "İlyas Çifçi", true);
        System.out.println(ilyas.getCustomerToken());

        ilyas.setCustomerFullName("1254İl2066", "ilyas çif");


        int[] array = {0, 1, 2, 3, 4, 5};
        System.out.println(sayiKaydir(array, 2));

    }

    public static ArrayList<Integer> sayiKaydir(int[] array, int kaymaMiktari) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int sayi : array) {
            arrayList.add(sayi);
        }
        for (int i = 0; i < kaymaMiktari; i++) {
            arrayList.add(0, arrayList.remove(arrayList.size() - 1));
        }
        return arrayList;
    }


}
