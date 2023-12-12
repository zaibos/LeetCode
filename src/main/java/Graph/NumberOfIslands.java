package Graph;

public class NumberOfIslands {

    private int numberOfIsland(int[][] matrix) {
        int IslandCount=0;
        int row = matrix.length; int col = matrix[0].length;
        if(matrix.length == 0 || matrix == null) return 0;
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == 1){
                    IslandCount++;
                    isIslands(matrix,i,j);
                }
            }
        }
        return IslandCount;
    }

    private void isIslands(int[][] matrix, int i, int j) {
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length || matrix[i][j] == 0 ) return;
        matrix[i][j] = 0;
        isIslands(matrix, i,j-1);
        isIslands(matrix, i,j+1);
        isIslands(matrix, i-1, j);
        isIslands(matrix, i+1, j);
    }

    public static void main(String[] args) {
        final int[][] matrix = {
                { 1, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 0 },
                { 0, 0, 0, 1, 1 },
                { 1, 0, 0, 1, 1 }
        };
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        System.out.println("Maximum gold collected = "+numberOfIslands.numberOfIsland(matrix));
    }


}
