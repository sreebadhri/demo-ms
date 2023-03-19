package com.sap.demo.controller;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1, 10, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
        }
    }

    public static int[] removeDuplicates(int[] numbersWithDuplicates) {
        // Sorting array to bring duplicates together
        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }

    private static void mine() {
        int[] numbers = {5,6,3,2,7,5,1,8,9,9};
        Arrays.sort(numbers);
        int[] withOutDuplicates = new int[numbers.length];

        int previousNumber = numbers[0];
        int index = 0;
        withOutDuplicates[index] = numbers[0];

        for (int i=1; i<numbers.length; i++) {
            if (previousNumber != numbers[i]) {
                index = index + 1;
                withOutDuplicates[index] = numbers[i];
            }
            previousNumber = numbers[i];
        }
        Arrays.stream(withOutDuplicates).forEach(value -> System.out.println(value));
    }

}
