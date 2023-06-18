package TwoDimensionalArray;

import java.util.Arrays;

public class Basic3Darray {

    public static void main(String[] args) {
        //String [][] s = new String[4][2];
        String[][]s={

                      {"aditya","kittu"},
                      { "jappa","res"},
                      {"akp","pubg"},
                      {"krishna","prasad"}

                    };


        for (String[] str:s) {
            //System.out.println("the array is : ");
            System.out.println(Arrays.toString(str));
        }
    }

}
