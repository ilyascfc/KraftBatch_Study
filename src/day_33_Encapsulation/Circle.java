package day_33_Encapsulation;

public class Circle {
    private double radius;
    private final double PI=3.14; //final ile kesinlikle değiştirilemez.

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double circleArea(){
        return this.PI*this.radius*this.radius;
    }






}
