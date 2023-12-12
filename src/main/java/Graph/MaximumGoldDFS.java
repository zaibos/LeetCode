package Graph;

public class MaximumGoldDFS {

    private int calcMaxSum(int[][] grid) {
        int max = 0; int row = grid.length; int col = grid[0].length;
        if ( grid.length == 0 || grid == null) return 0;
        for(int i = 0; i < row ; i++){
            for(int j = 0; j < col; j++ ){
                if(grid[i][j] > 0 ){
                    int gold = findMaxGold(grid, i, j , row, col, new boolean[row][col]) ;
                    max = Math.max(max, gold);
                }
            }
        }
        return max;
    }

    private int findMaxGold(int[][] grid, int i, int j, int row, int col, boolean[][] visited) {
        if(i < 0 || j < 0 || i>=row || j>=col || grid[i][j] == 0 || visited[i][j]) return 0;
        visited[i][j] = true;
        int left = findMaxGold(grid, i,j-1, row, col, visited);
        int right = findMaxGold(grid, i,j+1, row, col, visited);
        int up = findMaxGold(grid, i-1, j, row, col, visited);
        int down = findMaxGold(grid, i+1, j, row, col, visited);
        visited[i][j] = false;
        return Math.max(left , Math.max(right, Math.max(up, down))) + grid[i][j];
    }

    public static void main(String[] args) {
        final int[][] matrix = {
                { 0, 6, 0 },
                { 5, 8, 7 },
                { 0, 9, 0 }
        };
    MaximumGoldDFS maximumGoldDFS = new MaximumGoldDFS();
    System.out.println("Maximum gold collected = "+maximumGoldDFS.calcMaxSum(matrix));
    }
}
