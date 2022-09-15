package day_32_Constructors_Cont;

public class Main_Day_32 {
    public static void main(String[] args) {
        Square square_1=new Square();
        square_1.sideLenght=5;
        System.out.println("Alan = " + square_1.calculateArea());
        System.out.println("Çevre = " + square_1.calculatePerimeter());

        Square square_2=new Square(8);
        System.out.println("Alan = " + square_2.calculateArea());
        System.out.println("Çevre = " + square_2.calculatePerimeter());

        Pencil kalem_1=new Pencil();
        Pencil kalem_2=new Pencil("sarı");
        Pencil kalem_3=new Pencil("kırmızı",6);
        Pencil kalem_4=new Pencil("yeşil", 4, false);
        System.out.println(kalem_4.haveEraser);
        kalem_4.write();
        kalem_4.delete();





    }
}
