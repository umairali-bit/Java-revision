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








    }
}
