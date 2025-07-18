package dev.lpa.PracPermMissingElem;

public class SetMismatch {

    public static void main(String[] args) {

        SetMismatch solution = new SetMismatch();
        int[] nums = {1,2,2,4};

        System.out.println("Array");

        printArray(nums);

        System.out.println("\nSetMismatch");
        int result[] = solution.findErrorNums(nums);
        System.out.println(result);

    }

    public int[] findErrorNums (int[] nums) {



    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



}
