package Inheritance;

public class shape {
    public void area(){
        System.out.println("start finding the area");
    }
}
class triangle extends shape {

    public void area(int l, int h) {
        System.out.println("the area of traingle is ");
        System.out.println(1 / 2 * l * h);
    }


}
 class rectangle extends triangle   {
        public void area(int l,int b,int h){
            System.out.println("the area of rectangle is ");
            System.out.println(l*b*h);
        }
 }
 class parent {
     public static void main(String[] args) {
        rectangle r= new rectangle();
         r.area();
        r.area(5,2,9);
        r.area(1,3);

       shape s = new rectangle();//downcasting(explicitly)
        s.area();




     }



 }


