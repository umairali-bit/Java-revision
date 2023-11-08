package dev.lpa;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        //setting 2nd element of the array to a different array

        int array2[][] = new int[4][4];
        array2[1] = new int[]{10,20,30};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object [3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));
        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int [2][2][2];
        System.out.println(Arrays.deepToString(anyArray));


        //to know what array belongs to what part
        for(Object element : anyArray){
            System.out.println("Element type = "+ element.getClass().getSimpleName());
            //System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }


    }
}
