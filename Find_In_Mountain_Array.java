package com.umang;


import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;

        int peak= findPeak(arr);
        if (arr[peak]==target) {
            System.out.println(peak);
        }

        int firstHalf = orderagnosticBinarySearch(arr, target, 0, peak-1);

        if ( target == arr[firstHalf]) {
            System.out.println(firstHalf);
        } else {
            System.out.println(orderagnosticBinarySearch(arr, target, peak+1, arr.length-1));
        }
    }
    public static int findPeak(int[] arr) {
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
    public static int orderagnosticBinarySearch(int[] arr,int target,int start,int end) {

        boolean checkoder = checkOder(arr, target, start, end);
        if (checkoder) {
            return assBinarySearch(arr, target, start, end);
        }
        return desBinarySearch(arr, target, start, end);
    }

    public static boolean checkOder(int[] arr,int target,int start,int end) {
        int mid = start + (end-start)/2;
        if (arr[mid] < arr[mid+1]) {
            return true;
        }
        return false;
        }

    public static int assBinarySearch(int[] arr,int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target < arr[mid]) {
                end = mid-1 ;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int desBinarySearch(int[] arr,int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (target < arr[mid]) {
                start = mid+1 ;
            }
            else if (target > arr[mid]) {
                end = mid-1;
            }
            else  {
                return mid;
            }
        }
        return -1;
    }
}




