package LogicalPrograms;

import java.util.Scanner;

public class Reversing_A_Number {
    public static void main(String[] args) {

        //1st logic for reversing a number

        Scanner s = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = s.nextInt();
        int rev = 0;

        while (num != 0) {
            //ASSUME GIVEN NUMBER IS 4321
            rev = rev * 10 + num % 10;//0*10+1234%10=0+4, 4*10+123%10=40+3=43, 43*10+12%10=430+2=432, 432*10+1%10=4321
            num = num / 10;// 1234/10=123, 123/10=12, 12/10=1, 1/10=0
        }
        System.out.println("the number after reversal with normal logic is :" + rev);
        
        if (num == rev) {
            System.out.println("it's an palindrome number");
        } else
            System.out.println("it's not an palindrome number");
    }
}





