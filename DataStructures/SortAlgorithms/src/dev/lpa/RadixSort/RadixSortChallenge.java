package dev.lpa.RadixSort;

/*
Sort the following values using Radix sort: "bcdef", "dbaqc","abcde", "omadd", "bbbbb"
All values are in lowercase
 */

public class RadixSortChallenge {

    public static void main(String[] args) {

        String[] array = {"bcdef", "dbaqc","abcde", "omadd", "bbbbb"};
        int stringLength = array[0].length();


        System.out.println("Before");
        for (String s : array) {
            System.out.print(s + " ");
        }

        radixSort(array, stringLength);

        System.out.println("\nAfter");
        for (String s : array) {
            System.out.print(s + " ");
        }

    }

    private static void radixSort(String[] array, int stringLength) {
        for (int pos = stringLength - 1; pos >=0; pos--) {
            radixSortByCharacter(array, pos);
        }
    }

    public static void radixSortByCharacter (String[] array, int charIndex) {

        int charItems = array.length;
        String[] output = new String[charItems];
        int[] count = new int[26];

        for (String s : array) {
            int charPos = s.charAt(charIndex) - 'a';
            count[charPos]++;
        }

        for (int i = 1; i<26; i++) {
            count[i] += count[i-1];
        }

        for (int i = charItems - 1; i >= 0; i--) {
            int charPos = array[i].charAt(charIndex) - 'a';
            output[count[charPos] - 1] = array[i];
            count[charPos]--;
        }

        System.arraycopy(output, 0, array, 0, charItems);

    }
}
