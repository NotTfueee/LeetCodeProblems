package Array.TwoDArrays;

//File Created by -- > anuragbhatt
//Created On -- > 14/12/23,Thursday

import java.util.Arrays;

public class DifferenceBetweenOnesAndZerosInRowAndColumn {

    public static void main(String[] args)
    {
        int[][] grid = {{0,1,1} , {1,0,1} , {0,0,1}};

        System.out.println(Arrays.deepToString(oneMinusZero(grid)));
    }

    public static int[][] oneMinusZero(int[][] grid)
    {
        int n = grid.length , m = grid[0].length;

        int[] rowZeroCount = new int[n];
        int[] rowOneCount = new int[n];
        int[] colOneCount = new int[m];
        int[] colZeroCount = new int[m];

        for(int i = 0 ; i < n ; ++i)
        {
            for(int j = 0 ; j < m ; ++j)
            {
                if(grid[i][j] == 0)
                {
                    colZeroCount[j]++;
                    rowZeroCount[i]++;
                }
                else
                {
                    colOneCount[j] ++;
                    rowOneCount[i] ++;
                }
            }
        }

        int[][] ans = new int[n][m];

        for(int i = 0 ; i < n ; ++i)
        {
            for(int j = 0 ; j < m ; ++j)
            {
                ans[i][j] = rowOneCount[i]+colOneCount[j] - rowZeroCount[i]-colZeroCount[j];
            }
        }

        return ans;
    }
}
