package LogicalPrograms;

import java.util.Scanner;

public class oddnumberusingscanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num = s.nextInt();
        if(num%2==0)
            System.out.println("it's an even number");
        else
            System.out.println("it's an odd number");

    }
}
