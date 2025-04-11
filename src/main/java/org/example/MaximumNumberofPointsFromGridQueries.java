package org.example;

public class MaximumNumberofPointsFromGridQueries {

    public static int[] maxPoints(int[][] grid, int[] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            ans[i] =checkPoints( grid,0,0,queries[i],visited);
        }
        return ans;
    }

    public static int checkPoints(int[][] grid, int r, int c , int n, boolean[][] visited) {
    if (c<0||r<0||grid.length <= r || grid[0].length <=c ||grid[r][c] >= n || visited[r][c] ) return 0;
    visited[r][c] = true;
    return 1+checkPoints(grid,r+1,c,n, visited)
            +checkPoints(grid,r-1,c,n, visited)
            + checkPoints(grid,r,c+1,n, visited)
            + checkPoints(grid,r,c-1,n, visited);
    }

}
