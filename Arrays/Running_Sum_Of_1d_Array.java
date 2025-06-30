// Problem: https://leetcode.com/problems/running-sum-of-1d-array/
// Uploaded on: 2025-06-30

class Solution {
    public int[] runningSum(int[] nums) {
        int n= nums.length;
        // int[] ans = new int[n];

        // ans[0]=nums[0];

        for (int i=1; i<n; i++) {
            // ans[i] = ans[i-1] + nums[i];
            nums[i] += nums[i-1];
        }
        return nums;
    }
}