package Week4.Session1;
import java.io.*;
import java.util.*;

public class RowandColPairs {
    public boolean equalArrays(int[] row, int[] col)
    {
        return Arrays.equals(row, col);
    }
    public static void main(String[] args)throws Exception {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int[][] grid = {
                {3,2,1}, {1,7,6}, {2,7,7}
        };
        int m = grid[0].length;
        int n = grid.length;
        for( int i=0; i<m; i++)
        {
            int k =0;
            int[] row = new int[m];
            for(int j=0 ;j<n; j++)
            {
                row[k++] = grid[i][j];
            }

            for(int x = 0; x<n; x++)
            {
                int k =0;
                int[] col = new int[n];
                for(int y =0 ; y< m; y++)
                    col[k++]= grid[x][y];
            }
//            for(int x : row)
//                System.out.print(x+" ");
//            System.out.println();
        }

    }
}
