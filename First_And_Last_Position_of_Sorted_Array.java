class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first =checkFirst(nums, target);
        int last = checklast(nums, target);
        return new int[]{first,last};
    }

    public int checkFirst(int[] nums, int target) {
        int n= nums.length;
        int start = 0;
        int end = n-1;
        int result=-1;
        while( start <= end) {
            int mid = start + (end-start) / 2;
            if ( target < nums[mid]) {
                end = mid-1;
            }
            if ( target > nums[mid]) {
                start = mid+1;
            }
            if ( target == nums[mid]) {
                result= mid;
                end = mid-1;
            }
        }
        return result;
    }
    public int checklast(int[] nums, int target) {
        int n= nums.length;
        int start = 0;
        int end = n-1;
        int result= -1;
        while( start <= end) {
            int mid = start + (end-start) / 2;
            if ( target < nums[mid]) {
                end = mid-1;
            }
            if ( target > nums[mid]) {
                start = mid+1;
            }
            if ( target == nums[mid]) {
               result = mid;
               start= mid+1;
            }
        }
        return result;
    }
}