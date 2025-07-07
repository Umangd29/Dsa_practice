// Problem: https://leetcode.com/problems/number-of-good-pairs/
// Uploaded on: 2025-07-07

class Solution {
     public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int pairs=0;
        for ( int i=0; i<n; i++) {
            int temp = nums[i];
            int a =0;
            for( int j=i+1; j<n; j++) {
                if ( temp == nums[j]) {
                    a++;
                }
            }
            pairs += a;
        }
        return pairs;
    }
}