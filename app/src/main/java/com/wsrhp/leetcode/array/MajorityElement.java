package com.wsrhp.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int len = nums.length;
        int targetCount = len / 2;
        Map<Integer, Integer> historyCount = new HashMap<>();
        for (int currentNum : nums) {
            Integer existCount = historyCount.get(currentNum);
            if (existCount == null) {
                historyCount.put(currentNum, 1);
                continue;
            }
            if (existCount + 1 > targetCount) return currentNum;
            historyCount.put(currentNum, existCount + 1);
        }
        throw new RuntimeException("No Majority Element");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));

    }
}
