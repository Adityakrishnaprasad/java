package SingleDimensionalArrays;

public class ObjectTypeArray {
    public static void main(String[] args) {
        Object o[]=new Object[6]; //it is used to store hetrogenous data in an array
        o[1]=10;
        o[2]=32.5;
        o[3]=true;
        o[4]='c';
        o[5]="aditya";


        for(int i=0;i<o.length;i++){
            System.out.println(o[i]);
        }

    }
}
