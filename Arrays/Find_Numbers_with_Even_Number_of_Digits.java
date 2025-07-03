// Problem: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Uploaded on: 2025-07-03

class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(countDigit(nums[i]) % 2 == 0 ) {
                count++;
            }
        }
        return count;
    }
    public int countDigit(int num) {
        // if (num == 0) return 1;
        // return (int) Math.log10(num) + 1;

        int count=0;
        if (num == 0) return 1;
        while(num >0) {
            count++;
            num /= 10;    
        }
        return count;
    }
}