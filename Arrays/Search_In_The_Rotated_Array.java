// Problem: https://leetcode.com/problems/search-in-rotated-sorted-array/
// Uploaded on: 2025-07-07

https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1688697138

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

           
            if (nums[mid] == target) {
                return mid;
            }

            
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; 
                } else {
                    start = mid + 1; 
                }
            }

            
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; 
                } else {
                    end = mid - 1; 
                }
            }
        }

        return -1; 
    }
}
