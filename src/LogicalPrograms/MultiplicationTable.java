package LogicalPrograms;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num=13;
        System.out.println("...multiplication table starting...");
        for (int i = 1; i <= num ; i++) {
            int p=num*i;
            System.out.println(num+"*"+i+"="+p);

        }
    }
}
