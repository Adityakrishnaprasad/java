package Polymorphism;

public class main {
    public static void main(String[] args) {
        Vehicle_RuntimePolymorphism v;
        v=new Vehicle_RuntimePolymorphism();
        v.start();
        v=new Firstgear();
        v.start();
        v=new Accelrator();
        v.start();

    }
}
