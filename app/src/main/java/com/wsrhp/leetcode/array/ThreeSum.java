package com.wsrhp.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if (nums == null || length <= 2) return result;

        Arrays.sort(nums);

        for (int i = 0 ; i < length - 2 ; i ++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            int target = -nums[i];
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;right--;
                    // debug log: 这里不是continue，是left++; while里放continue不就是死循环？？？
//                   while(left < right && nums[left] == nums[left - 1]) continue;
                    while(left < right && nums[left] == nums[left - 1]) left ++;
                    while(left < right && nums[right] == nums[right + 1]) right --;
                } else if (nums[left] + nums[right] < target) {
                    left ++;
                } else {
                    right --;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = new int[]{-2,0,0,2,2};
        List<List<Integer>> result = threeSum.threeSum(nums);
        System.out.println(result);
    }
}
