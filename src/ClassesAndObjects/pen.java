package ClassesAndObjects;

public class pen {
    String color;
    String type;
    int cost;

    public void write(){
        System.out.println("Writing something");
        System.out.println("the pen's color is : " + this.color);
        System.out.println("type of the pen is : "+ this.type);
        System.out.println("cost of the pen is : "+ this.cost);
    }

}

class pendriver{
    public static void main(String[] args) {
        pen p = new pen();
        p.color="blue";
        p.type="click pen";
        p.cost=10;
        p.write();
    }
}
