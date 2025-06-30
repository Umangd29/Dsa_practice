// Problem: https://leetcode.com/problems/richest-customer-wealth/
// Uploaded on: 2025-06-30

class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        
        int maxWealth = 0;

        for (int i=0; i<accounts.length; i++) {
            int wealth = 0;
            for (int j=0; j<accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}