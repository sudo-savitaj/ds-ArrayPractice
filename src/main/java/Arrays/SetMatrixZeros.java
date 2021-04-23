//https://leetcode.com/problems/set-matrix-zeroes/solution/
package Arrays;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

    public void setZeroesHighSpaceComplexcity(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        int noOfRows = matrix.length;
        int noOfCols = matrix[0].length;
        for(int i = 0; i< noOfRows; i++){
            for (int j=0;j<noOfCols;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i=0;i<noOfRows;i++){
            for (int j=0;j<noOfCols;j++){
                if(rows.contains(i)||cols.contains(j))
                    matrix[i][j] = 0;
            }
        }

    }

    public void setZeroes(int[][] matrix) {

    }

}
