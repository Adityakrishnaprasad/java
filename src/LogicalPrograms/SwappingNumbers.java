package LogicalPrograms;

public class SwappingNumbers {
    public static void main(String[] args) {
        int num1=98;
        int num2=23;
        int temp;
        System.out.println("before swaping the num1 is : "+num1);
        System.out.println("before swaping the num2 is : "+num2);

        System.out.println("...................................");
        
        temp=num2;
        num2=num1;
        num1=temp;
        System.out.println("after swapping the num1 is : "+num1);
        System.out.println("before swaping the num1 is : "+num2);
    }
}
