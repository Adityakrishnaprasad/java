package SingleDimensionalArrays;

public class DuplicateElementsInArray {

    public static void main(String[] args) {

        int [] d = {15,45,98,88,45};

        for(int i=0;i<d.length;i++){  // it will take the first element in array and checks the condition

            for(int j=i+1;j<d.length;j++){//once first condition passed it will check whether the first element is equal to the next element or not

                if(d[i]==d[j]) {  // it will compare both the arrays

                    System.out.println("the duplicate element in array is : "+d[i]);

                }


            }


        }

        

    }
}
