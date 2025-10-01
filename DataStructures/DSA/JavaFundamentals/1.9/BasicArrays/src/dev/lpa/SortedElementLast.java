package dev.lpa;

import java.util.Arrays;

public class SortedElementLast {

    public static void main(String[] args) {

        int[] a = {2,5,6,8,9,4};

        SortedElementLast s = new SortedElementLast();
        s.sort(a);
        System.out.println("After sort: " + Arrays.toString(a));

    }

 public void sort(int[] a) {

       int n = a.length;
       int last = a[n-1];
       int swapIndex = n -2;

       while(swapIndex>= 0 && a[swapIndex] > last){
       swapIndex--;
       }

       for (int i = n -1; i>=swapIndex+2; i-- ) {
           a[i] = a[i-1];
       }

       a[swapIndex + 1] = last;

    }
 }



