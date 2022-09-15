package day_31_Constructor;

public class Okul {
    // okul adında bir sınıf oluşturun
    // fields: rengi, kapasite, sınıfAdesi
    // metot : kapasite>500 ise kapasite aşılmıştır ikazı versin.
    // min 3 adet constractor
    public String renk;
    public int kapasite;
    public int sınıfAdedi;

    public Okul(){

    }
    public Okul(String renk){
        this.renk=renk;
    }
    public Okul(String renk, int kapasite, int sınıfAdedi){
        this.renk=renk;
        this.kapasite=kapasite;
        this.sınıfAdedi=sınıfAdedi;
    }
    public void kontrolKapasite(){
        if (this.kapasite>500){
            System.out.println("Kapasite Aşılmıştır.");
        }else {
            System.out.println("Kapasite aşılmasına "+(500-this.kapasite)+"kalmıştır.");
        }
    }

}
