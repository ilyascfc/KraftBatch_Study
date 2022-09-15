package day_33_Encapsulation;

public class dog {
    private String name;
    private String bread;
    public boolean isBlack;         // public oldugundan heryerden çağırır
    private int age;
    private int speed;

    public dog() {
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return this.speed*1.8;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
