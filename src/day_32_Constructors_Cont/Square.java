package day_32_Constructors_Cont;

public class Square {
    // Örnek-1
    // Square adında bir class oluşturun, sideLenght adında field tanımlayın, constructors,
    // calculateArea ve calculatePerimeter metodları oluşturarak main metodunda bu class dan
    // bir obje oluşturun.

    public int sideLenght;
    public Square(){                    // parametresiz constructors
    }
    public Square(int sideLenght){      // 1 parametreli constructors
        this.sideLenght=sideLenght;
    }
    public double calculateArea(){              // alanı hesapladı
        return Math.pow(this.sideLenght,2);
    }
    public double calculatePerimeter(){         // çevreyi hesapladı
        return 4*this.sideLenght;
    }
}
