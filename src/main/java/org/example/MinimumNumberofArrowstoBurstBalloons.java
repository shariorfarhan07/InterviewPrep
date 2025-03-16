package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberofArrowstoBurstBalloons {
    public static void main(String[] args) {
//        arr = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] arr = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(arr));

    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1, start = points[0][0], end = points[0][1], max = points[0][1];
        for (int i = 0; i < points.length; i++) {
            start = points[i][0];
            if (max < start) {
                count++;
                max = points[i][1];
            }
        }
        return count;
    }
}
