// Problem: https://leetcode.com/problems/running-sum-of-1d-array/
// Uploaded on: 2025-06-30

import java.lang.Math;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int n= candies.length;
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for(int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int i=0; i< n; i++) {
            ans.add((candies[i] + extraCandies) >= max);
        }
        return ans;
    }
}