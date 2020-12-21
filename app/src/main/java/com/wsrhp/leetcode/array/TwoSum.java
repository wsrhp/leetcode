package com.wsrhp.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>(length - 1);
        map.put(nums[0], 0);
        for (int i = 1 ; i < length ; i ++) {
            int another = target - nums[i];
            if (map.containsKey(another)) {
                return new int[]{map.get(another), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int target = 6;
        int[] nums = new int[]{3,2,4};
        TwoSum twoSum = new TwoSum();
        System.out.println("result: " + Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
