package dev.lpa.ShellSort;

public class ShellSortMain {

    public static void main(String[] args) {


        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};


//        initialize gap value and reduce it to each iteration
        for (int gap = intArray.length / 2; gap > 0; gap /=2) { // gap = 3


            for (int i = gap; i < intArray.length; i++) {// i = 3

                int newElement = intArray[i]; //newElement = 7

                int j = i; // j = 3

                while (j >= i && intArray[j - gap] > newElement) { // j - gap = 0 which is 20 > newElement = 7
                    intArray[j] = intArray[j - gap]; // i = 3 which is 7 will be moved to intArray[0]
                    j -= gap; // move 7 into index 0

                    //{ 7, 35, -15, 20, 55, 1, -22}


                }


            }



        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] + " ");
        }
    }
}
