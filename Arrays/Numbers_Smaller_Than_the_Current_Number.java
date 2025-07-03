// Problem: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// Uploaded on: 2025-07-03

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length;
        int[] ans = new int[n];
        for (int i=0; i<n; i++) {
            int occurence = 0;
            occurence = checkMins(nums, nums[i]);
            ans[i] = occurence;
        }
        return ans;
    }
    public int checkMins(int[] nums, int num) {
        int temp= num;
        int count=0;
        for (int i=0; i<nums.length; i++) {
            if ( temp > nums[i]) {
                count++;
            }
        }
        return count;
    }
}