// Problem: https://leetcode.com/problems/rotate-array/
// Uploaded on: 2025-07-07

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k % n; 

        reverse(nums, 0, n-1); // reverse all
        reverse(nums, 0, k-1); // reverse first k
        reverse(nums, k, n-1); // reverse last k-1
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
        
    }
}

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         int[] ans = new int[n];

//         for (int i=0; i<n; i++) {
//             ans[(i+k)%n] = nums[i];
//         }
//         for (int i = 0; i < n; i++) {
//             nums[i] = ans[i];
//         }
//     }
// }