package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7, 10}));
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        String range = "";
        int start = nums[0];
        int end = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    range = "" + start;
                } else {
                    range = "" + start + "->" + nums[i - 1];
                }
                result.add(range);
                start = nums[i];
            }
        }
        if (start == nums[nums.length - 1]) {
            result.add("" + start);
        } else result.add("" + start + "->" + nums[nums.length - 1]);


        return result;
    }
}
