package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //manually boxing and Unboxing

        Integer boxedInt = Integer.valueOf(15);                         // preferred but unnecessary
        //Integer deprecatedBoxing = new Integer(15);               // deprecated since JDK 9
        int unboxedInt = boxedInt.intValue();


        // Automatic

        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
       // System.out.println(autoUnboxed.getClass().getName());       // cannot use getClass() on a primitive type like this

        Double resultBoxed = getLiteralDoublePrimitive();      // Boxing is when you convert a primitive type to a reference type
        double resultUnboxed = getDoubleObject();             // Unboxing is when you convert a reference type to a primitive type

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString((wrapperArray)));

        System.out.println(wrapperArray[0].getClass().getName());  //getting the class name of element 0

        Character[] characterArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1,2,3,4,5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(int... varargs) {

        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

    private static int returnInt(Integer i){              // unboxing

        return i;
    }

    private static Integer returnAnInteger (int i ){      // boxing
        return i;
    }

    private static Double getDoubleObject() {

        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {

        return 100.00;
    }
}

