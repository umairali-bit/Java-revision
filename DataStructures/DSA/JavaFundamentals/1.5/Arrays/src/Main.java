import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int age[] = new int[5];

        age[0] = 5;
        age[1] = 2;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);

        System.out.println(age.length);


        int marks[] = {98, 12,45,12,65};

        System.out.println(marks[0]); //98

  //      System.out.println(marks[8]);//arraysIndexOutOfBoundException

        String names[] = {"Walter White", "Skyler White", "Jessie Pinkman", "Hank Schrader", "Gus Fring"};

        for (int i = 0; i < names.length ; i++) {

            System.out.println("Name is " + names[i]);

        }

        for (String i : names) {
            System.out.println(Arrays.toString(i.toCharArray()));
        }

        /*
        [W, a, l, t, e, r,  , W, h, i, t, e]
        [S, k, y, l, e, r,  , W, h, i, t, e]
        [J, e, s, s, i, e,  , P, i, n, k, m, a, n]
        [H, a, n, k,  , S, c, h, r, a, d, e, r]
        [G, u, s,  , F, r, i, n, g]
         */


        for (String string : names) {
            System.out.println("Name is " + string);
        }

        /*
        Name is Walter White
        Name is Skyler White
        Name is Jessie Pinkman
        Name is Hank Schrader
        Name is Gus Fring

         */

        int numbers[] = {23, 12, 6,7,15,3,2,56};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }
        System.out.println(sum);


        // using forEach method
        int sum2 = 0;
        for (int number : numbers) {
            sum2 += number;
        }
        System.out.println(sum2);


        //returning the smallest number in the array
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                
                
            }

        }
        System.out.println("The smallest number is " + smallest);



        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min); //2








    }
}
