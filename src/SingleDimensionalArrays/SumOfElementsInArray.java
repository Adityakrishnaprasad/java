package SingleDimensionalArrays;

public class SumOfElementsInArray {

    public static void main(String[] args) {

        int [] d = {15,45,98,88};
        int sum=0;
        for (int i=0;i<d.length;i++){
            sum=sum+d[i];
        }

        System.out.println("sum of elements in array is : "+sum);
        System.out.println("Average of elements in array is : "+sum/d.length);
    }
}
