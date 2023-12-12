package Graph;

import java.util.HashSet;
import java.util.Set;

public class DistinctIsland {

    private int numberOfDistinctIsland(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int row = matrix.length; int col = matrix[0].length;
        Set<String> set = new HashSet<>();
        for( int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 1){
                   String path = islands(matrix,i,j,row,col,"X");
                   set.add(path);
                }
            }
        }
        return set.size();
    }

    private String islands(int[][] matrix, int i, int j, int row, int col, String direction) {

        if( i<0 || j < 0 || i >= row || j >= col || matrix[i][j] == 0 ) return "O";
        matrix[i][j] = 0;
        String left = islands(matrix,i,j-1,row,col,"L");
        String right = islands(matrix,i,j+1,row,col,"R");
        String up = islands(matrix,i-1,j,row,col,"U");
        String down = islands(matrix,i+1,j,row,col,"D");

        return direction+left+right+up+down;
    }

    public static void main(String[] args) {
        final int[][] matrix = {
                { 1, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 0 },
                { 0, 0, 0, 1, 1 },
                { 1, 0, 0, 1, 1 }
        };
        DistinctIsland distinctIsland = new DistinctIsland();
        System.out.println("Maximum gold collected = "+distinctIsland.numberOfDistinctIsland(matrix));
    }


}
