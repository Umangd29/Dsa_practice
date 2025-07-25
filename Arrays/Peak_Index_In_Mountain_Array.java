// Problem: https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Uploaded on: 2025-07-07

https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak= findPeak(arr);
        return peak;

    }
    int findPeak(int[] arr) {
        int start= 0;
        int end= arr.length-1;

        while (start < end) {
            int mid = start + (end-start)/2;

            if (arr[mid] < arr[mid+1]) {
                start = mid+1 ;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}