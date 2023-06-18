package TwoDimensionalArray;

public class ReadingDataFrom3DArray {
    public static void main(String[] args) {
        int [][] a = { { 10,20},{23,45},{34,99}};

        //using nested-for loop

        /*for(int r=0;r<a.length;r++){
            for (int c=0;c<a[r].length;c++){
                System.out.print(a[c][r]+""+",");
            }
        }*/

        //using foreach loop(enhanced)

        for(int[]z:a){
           for(int v:z){
               System.out.println(v+"");
           }
           System.out.println();
        }


    }
}
