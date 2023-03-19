package com.sap.demo.repository;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++) {
            if(i == nums.length-1){
                continue;
            }
            int current = nums[i] + nums[i+1];
            if(current == target) {
                result[0] = i;
                result[1] = i+1;
                return result;
            }
        }
        return result;
    }
}