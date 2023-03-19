package com.sap.demo.controller;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        // Given input Array from 1 to n
        int[] input = {10,9,6,7,4,3,5,1,2};
        int sum = 0;
        for (int i=0; i<input.length; i++) {
            sum = sum + input[i];
        }
        System.out.println("sum is : " + sum);
        System.out.println((10*11)/2);

        // Calculate n value
        int n = input.length + 1;
        System.out.println("n is " + n);

        int[] numbers = {1,2,3,4,5,7,8,9};
        printMissedNumber(numbers);
    }

    public static void printMissedNumber(int[] numbers) {
        Arrays.sort(numbers);
        int previousNumber = numbers[0];
        for (int i=1; i< numbers.length; i++) {
            if (numbers[i] != previousNumber+1){
                System.out.println(previousNumber+1);
            }
            previousNumber = numbers[i];
        }
    }
}
