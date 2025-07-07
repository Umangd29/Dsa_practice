// Problem: ..
// Uploaded on: 2025-07-07

package com.umang;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target= 14;
        // covert to 1d
        int[] newArr = covertTo1D(arr);

        // binary search in 1d
        int index = binarySearch(newArr, target, 0, newArr.length - 1);

        // coverting 1d target index to 2d (row,col)
        int[] ans = findRowCol(arr,index);

        System.out.println(Arrays.toString(ans));
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                return ans;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int[] covertTo1D(int[][] arr) {
        int totalRow = arr.length;
        int totalColumn = arr[0].length; // assume n*n matrix
        int totalElement = totalRow * totalColumn;
        int[] newArr = new int[totalElement];
        int target = 14;
        int k = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                newArr[k++] = arr[row][col];
            }
        }
        return newArr;
    }

    public static int[] findRowCol(int[][] arr,int index) {
        int[] ans = new int[2];
        if (index != -1) {
            ans[0] = index / arr[0].length;
            ans[1] = index % arr[0].length;
        } else {
            ans[0] = -1;
            ans[1] = -1;
        }
        return ans;
    }
}
