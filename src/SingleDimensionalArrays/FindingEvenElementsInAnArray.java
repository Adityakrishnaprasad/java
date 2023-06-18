package SingleDimensionalArrays;

public class FindingEvenElementsInAnArray {
    public static void main(String[] args) {
        int [] a = {45,34,56,23,77,90};

        //for finding even numbers in a array

        for (int i=0;i<a.length;i++){
            if(a[i]%2==0)
                System.out.println(a[i]);
        }

        }




}
