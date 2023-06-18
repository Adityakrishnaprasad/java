package SingleDimensionalArrays;

public class FindingMissingValueInAnArray {
    public static void main(String[] args) {

        int [] a = {1,2,3,5,6};
        int total=0;
        for(int x:a){
            total=total+x;
        }
        System.out.println("the total number of values before missing"+total);

        int total2=0;
        for(int i=1;i<=6;i++){  //1,2,3,4,5,6
            total2=total2+i;// 1,3,7,11,16,22
        }
        System.out.println("missing value in an array is "+(total2-total));


    }

}
