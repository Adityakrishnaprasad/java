package SingleDimensionalArrays;

public class BasicArrayProgram
{
    public static void main(String[] args)
    {
        int[] a = {23,45,68,44};

        //using for loop

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        //using for each loop

        for (int b:a) {
            System.out.print(b+",");
        }

    }
}
