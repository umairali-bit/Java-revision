package dev.lpa;

import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {

        int[] A = {2,3,1,5};

    }

    public int solution(int[] A) {

        Arrays.sort(A);

        for (int x = 0; x < A.length; x++ ) {
            if(x == A[x]) {
                x ++;
            }
            else if(x != A[x]){
                return x;

            }

            }

        }





    }




}



