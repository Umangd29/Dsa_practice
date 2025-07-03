// Problem: https://leetcode.com/problems/shuffle-the-array/
// Uploaded on: 2025-07-03

class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] ans = new int[2*n];
        int l = n;
        int s= 0;

        int i=0;
        while (s<l && l< 2*n) {
            ans[i++]= nums[s++];
            ans[i++] = nums[l++];
        }
        return ans;
    }
}