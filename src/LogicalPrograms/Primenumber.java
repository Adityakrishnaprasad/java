package LogicalPrograms;

public class Primenumber {
    public static void main(String[] args) {
        int num=7;
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if (num % i == 0)
            {
                count++;
            }
        }
        if(count==2)
            System.out.println("the given number is prime number");
        else
            System.out.println("the number is not prime");

    }
}
