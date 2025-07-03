package com.umang;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {2, 4, 9, 16, 27, 33, 45};
        int target = 4;
        int ans = ceiling(nums, target);
        System.out.println(ans);
    }

    static int ceiling(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if (target > nums[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return nums[mid];
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return nums[start];
    }
}
