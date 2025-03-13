package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class InsertInterval {
    public static void main(String[] args) {
        int[][] array = {{1, 3}, {6, 9}};
        int[] interval = {2, 5};
        Arrays.stream(insert(array, interval)).forEach((s) -> {
            System.out.print(Arrays.toString(s));
        });

        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        System.out.println();
        Arrays.stream(insert(intervals, newInterval)).forEach((s) -> {
            System.out.print(Arrays.toString(s));
        });
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] > newInterval[1]) {
                res.add(newInterval);
                for (int j = i; j < intervals.length; j++) {
                    res.add(intervals[j]);
                }
                return res.toArray(new int[res.size()][]);
            } else if (intervals[i][1] < newInterval[0]) {
                res.add(intervals[i]);
            } else {
                newInterval = new int[]{
                        Math.min(newInterval[0], intervals[i][0]),
                        Math.max(newInterval[1], intervals[i][1]),
                };
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}
