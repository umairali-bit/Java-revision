package dev.lpa;

public class FrogJump {

    public static void main(String[] args) {

        FrogJump solver = new FrogJump();

        int X = 30;
        int Y = 85;
        int D = 30;

        int result = solver.solution (X, Y, D);
        System.out.println("Minimal number of jumps = " + result);


    }

    public int solution(int X, int Y, int D) {

        //finding the distance that frog needs to cover
        int distance = Y - X;

        if (distance <= 0) {
            return 0;
        }

        //making sure that the distance is covered
        return (distance + D - 1) / D;

    }
}
