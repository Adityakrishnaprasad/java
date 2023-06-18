package SingleDimensionalArrays;

public class FindingMatchingElementsIn2Arrays {
    public static void main(String[] args) {
        int[] d = {15, 45, 98, 88, 45};
        int[] e = {23, 45, 65, 12, 15};

        for (int i = 0; i < d.length; i++) {  // it will take the first element in array and checks the condition

            for (int j = 0; j < e.length; j++) {//once first condition passed it will check whether the first element is equal to the next element or not

                if (d[i]==e[j]) {  // it will compare both the arrays



                }
                System.out.println(d[i]+" "+e[j]);

            }
        }
    }
}
