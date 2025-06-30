// Problem: https://leetcode.com/problems/build-array-from-permutation/
// Uploaded on: 2025-06-30

class Solution {
    public int[] buildArray(int[] nums) {
        
        // int[] tempNums = new int[nums.length];
        // for(int i= 0; i < nums.length ; i ++) {
        //     tempNums[i] = nums[nums[i]];
        // }
        // return tempNums;


        int n= nums.length;


        for(int i= 0; i < n ; i ++) {
           nums[i] = nums[i] + (n * (nums[nums[i]] % n));
        }

        for(int i= 0; i < n ; i ++) {
           nums[i] = nums[i] /n ;
        }

        return nums;
    }
}