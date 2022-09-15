package day_32_Constructors_Cont;

public class Pencil {
    // Örnek-2
    // Pencil adında bir class oluşturun, color, lenght, haveEraser adında fields tanımlayın,
    // constructors (4 adet) , write ve delete metodları oluşturarak main metodunda bu class dan
    // bir obje oluşturun.(this() metodu kullanılacak

    public String color;
    public int lenght;
    public boolean haveEraser;

    public Pencil(){                                               // parametresiz constructors
    }
    public Pencil(String color){                                   // 1 parametreli constructors
    this.color=color;
    }
    public Pencil(String color, int lenght){                       // 2 parametreli constructors
    this.color=color;
    this.lenght=lenght;
    }
    public Pencil(String color, int lenght, boolean haveEraser){    // 3 parametreli constructors
        this.color=color;
        this.lenght=lenght;
        this.haveEraser=haveEraser;
    }
    public void write(){
        System.out.println("Kalem Yazmaya Başladı");
    }
    public void delete() {
        if (this.haveEraser) {
            System.out.println("Silme İşlemi Başarılı...");
        } else {
            System.out.println("Silme İşlemi Başarız...");
        }
    }


}
