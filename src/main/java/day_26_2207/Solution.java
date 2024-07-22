package day_26_2207;

// https://leetcode.com/problems/island-perimeter/description/

// https://www.youtube.com/watch?v=FkjFlNtTzc8
// https://www.youtube.com/watch?v=fISIuAFRM2s


public class Solution {

    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        Solution solution = new Solution();
        System.out.println(solution.islandPerimeter(grid));
        System.out.println(solution.islandPerimeterWithDepthFirstSearch(grid));
    }

    // 4 ms Beats 99.82%
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }

    // 6 ms Beats 37.06%
    public int islandPerimeterWithDepthFirstSearch(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return getPerimeter(i, j, grid);
                }
            }
        }
        return 0;
    }

    private int getPerimeter(int i, int j, int[][] grid) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] == 0) {
            return 1;
        }

        // Check if the cell is already visited
        if (grid[i][j] == -1) {
            return 0;
        }

        // Mark the cell as visited
        grid[i][j] = -1;

        // Sum up the perimeters from all four directions
        int perimeter = getPerimeter(i, j + 1, grid);
        perimeter += getPerimeter(i + 1, j, grid);
        perimeter += getPerimeter(i - 1, j, grid);
        perimeter += getPerimeter(i, j - 1, grid);
        return perimeter;
    }
}
