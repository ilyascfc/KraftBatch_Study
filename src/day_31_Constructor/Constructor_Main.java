package day_31_Constructor;

public class Constructor_Main {
    public static void main(String[] args) {
        Okul kraftBatchOkulu=new Okul();
        Okul kraftBatchOkulu_1=new Okul("kırmızı");
        Okul kraftBatchOkulu_2=new Okul("pembe",400,23);
        Okul kraftBatchOkulu_3=new Okul("sarı",470,30);
        System.out.println("kraftBatchOkulu_3.kapasite = " + kraftBatchOkulu_3.kapasite);
        kraftBatchOkulu_3.kontrolKapasite();
    }
}
