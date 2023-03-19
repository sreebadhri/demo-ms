package com.sap.demo.controller;


import java.util.*;
import java.util.stream.Collectors;

public class IntQuestions {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,10,20,30);
        numbers.stream().collect(Collectors.summingInt(Integer::intValue));

        int[] array = {1,2,3,4,5,6};
        List<int[]> ints = Arrays.asList(array);

        Integer[] arrays = {1,2,3,4,5,6};
        List<Integer> integers = Arrays.asList(arrays);

        List<Integer> priceArray = List.of(7,1,5,3,6,4);
        Collections.min(priceArray);
        int minValue = priceArray.stream()
                .min((o1, o2) -> o1.compareTo(o2))
                .get().intValue();

        Collections.max(priceArray);
        Collections.min(priceArray);

        int indexOfMinValue = priceArray.indexOf(minValue);
        List<Integer> remainingValues = priceArray.subList(indexOfMinValue, priceArray.size());
        int maxvalue = remainingValues.stream().max((o1, o2) -> o1.compareTo(o2)).get().intValue();
        System.out.println("min " + minValue);
        System.out.println("max " + maxvalue);
        System.out.println(maxvalue-minValue);


    }
}
