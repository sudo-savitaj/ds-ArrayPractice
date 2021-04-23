//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package binarySearch;

public class RangeSearch {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1,-1};
        range[0] = getExtremeIndex(nums, target, true);
        range[1] = getExtremeIndex(nums,target,false);
        return range;
    }


    private int getExtremeIndex(int[] nums, int target, boolean left) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int idx =-1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target ) {
                if(left) {
                    high = mid-1;
                }
                else {
                    low = mid + 1 ;
                }
                idx = mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1 ;
            }

        }
        return idx;

    }

    public int[] searchRangeSearch(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + ( end - start) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    private int findLast(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + ( end - start) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    public void displayResult() {
        int[] inputArray = new int[]{1,2,3};
        int searchItem = 2;
        int[] range = searchRange(inputArray, searchItem);
        for (int element : range) {
            System.out.print(element);
        }

        System.out.println();
        range = searchRangeSearch(inputArray, searchItem);
        for (int element : range) {
            System.out.print(element);
        }
    }
}
