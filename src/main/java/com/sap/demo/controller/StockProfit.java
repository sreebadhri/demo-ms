package com.sap.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StockProfit {


    public static void main(String[] args) {
        List<Integer> prices1 = Arrays.asList(13, 7, 5, 8, 11, 9);
        System.out.println(findMaxProfit1(prices1));
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).sum();
        List<Integer> strings = List.of(1,3);

        int i = strings.indexOf(3);

        System.out.println("Sum: " + sum);

        List<Double> prices = new ArrayList<>();
        prices.add(10.0);prices.add(14.0);prices.add(13.0);prices.add(2.0);prices.add(1.0);prices.add(1.0);
        double maxProfit = findMaxProfit(prices);
        System.out.println(maxProfit);
    }

    public static double findMaxProfit1(List<Integer> prices) {
        //List<Integer> prices1 = Arrays.asList(13, 7, 5, 8, 11, 9);
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
    public static double findMaxProfit(List<Double> prices) {
        double buy = prices.get(0);
        double profit = prices.get(1) - buy;
        for (int i = 1; i < prices.size(); i++) {
            double price = prices.get(i);
            if (price < buy) {
                buy = price;
            } else if (price - buy > profit) {
                profit = price - buy;
            }
        }
        return profit;
    }

}
