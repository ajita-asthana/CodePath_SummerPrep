package Week4.Session1;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RowandColPairs {
    public static boolean equalArrays(int[] row, int[] col)
    {
        return Arrays.equals(row, col);
    }
    public static void main(String[] args)throws Exception {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int[][] grid = {
                {3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2}
        };
        int m = grid.length;
        int n = grid[0].length;
        int[][] resRow = new int[m][n];
        int[][] resCol = new int[m][n];

        for( int i=0; i<m; i++)
        {
            int k =0;
            int l = 0;
            int[] row = new int[n];
            int[] col = new int[m];
            for(int j=0; j<n; j++)
            {
                row[k++] = grid[i][j];
                col[l++]= grid[j][i];
            }
            resRow[i] = row;
            resCol[i] = col;
        }
        int[] count = {0};
        Arrays.stream(resRow).forEach(
                i -> {
                    Arrays.stream(resCol).forEach(
                            j -> {
                                if(equalArrays(i, j))
                                    count[0]++;
                            }
                    );
                }
        );
//        System.out.println("The columns are: ");
//        Arrays.stream(resCol).forEach( i ->
//        {
//            Arrays.stream(i).forEach(j ->System.out.print(j+" "));
//            System.out.println();
//        });
        System.out.println("The equal number of rows and cols are: "+count[0]);
    }
}
