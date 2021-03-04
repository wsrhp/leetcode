package com.wsrhp.leetcode.array;

import java.util.Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int index = 1;
        int preNum = 1;
        for (int i = 0; i< nums.length ; i++) {
            if (nums[i] <= 0) continue;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] > index) return index;
            index ++;
        }
        return index;
    }
}
