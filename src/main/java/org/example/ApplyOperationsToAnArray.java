package org.example;

import java.util.Arrays;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(applyOperations(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8})));
    }

    public static int[] applyOperations(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                nums[i - 1] *= 2;
                nums[i] = 0;
            }
        }
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                r++;
            } else {
                nums[l++] = nums[r++];
            }

        }
        while (l < nums.length) {
            nums[l++] = 0;
        }


        return nums;
    }

}
