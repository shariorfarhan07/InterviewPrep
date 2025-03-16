package org.example;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{2, 6}, {8, 10}, {1, 3}, {15, 18}};
        Arrays.stream(merge(intervals)).forEach(a -> System.out.println(a[0] + "->" + a[1]));


    }

    public static int[][] merge(int[][] intervals) {
        intervals = Arrays.stream(intervals)
                .sorted((a, b) -> Integer.compare(a[0], b[0]))
                .toArray(int[][]::new);
        Stack<int[]> stack = new Stack<>();
        stack.push(intervals[0]);
        int[] newOne = null;
        for (int i = 1; i < intervals.length; i++) {
            int[] oldOne = stack.peek();
            int[] nextOne = intervals[i];
            if (oldOne[1] >= nextOne[0]) {
                newOne = new int[]{oldOne[0], Math.max(oldOne[1], nextOne[1])};
                stack.pop();
                stack.push(newOne);
            } else {
                stack.push(nextOne);
            }

        }
        return stack.toArray(new int[stack.size()][]);
    }
}
