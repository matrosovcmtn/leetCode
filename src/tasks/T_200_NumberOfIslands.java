package tasks;

public class T_200_NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid = {
                {'0', '1', '1', '1', '0'},
                {'1', '0', '0', '1', '0'},
                {'0', '1', '0', '0', '0'},
                {'1', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        if (rows == 0) return 0;
        int cols = grid[0].length;

        int num_of_islands = 0;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (grid[i][j] == '1') {
                    mark_current_island(grid, i, j, rows, cols);
                    num_of_islands += 1;
                }
            }
        }
        return num_of_islands;
    }

    private static void mark_current_island(char[][] grid, int i, int j, int rows, int cols) {

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != '1') return;

        grid[i][j] = '2';

        mark_current_island(grid, i + 1, j, rows, cols);
        mark_current_island(grid, i - 1, j, rows, cols);
        mark_current_island(grid, i, j + 1, rows, cols);
        mark_current_island(grid, i, j - 1, rows, cols);

    }

}
