package com.wsrhp.leetcode.array;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));

    }
}
