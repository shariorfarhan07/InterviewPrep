package org.example;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("low " + search(new int[]{3, 4, 5, 6, 1, 2}, 2));
    }

    public static int search(int[] nums, int target) {
        int low = searchSmallestBinarySearch(nums);
        System.out.println("low elem" + low);
        if (low == 0) {
            return binarySearch(nums, target, low, nums.length - 1);
        }
        int val = binarySearch(nums, target, low, nums.length - 1);
        if (val == -1) return binarySearch(nums, target, 0, low);
        return val;
    }

    public static int binarySearch(int[] nums, int target, int low, int high) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;

    }

    public static int searchSmallestBinarySearch(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }

        return low;
    }


}
