package com.gla.arrays;

public class LC1480 {

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] nums1 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums1[i] = sum;
        }

        return nums1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] result = runningSum(nums);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
