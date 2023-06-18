package LogicalPrograms;

public class FactorsOfGivenNumber {
    public static void main(String[] args) {
        int num=24;
        for (int i=1;i<=num;i++){
            if(num%i==0)
                System.out.println("the given number is divisible by : " + i);
        }
    }
}
