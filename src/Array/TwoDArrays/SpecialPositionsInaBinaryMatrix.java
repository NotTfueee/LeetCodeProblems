package Array.TwoDArrays;

//File Created by -- > anuragbhatt
//Created On -- > 13/12/23,Wednesday

import java.util.Arrays;

public class SpecialPositionsInaBinaryMatrix {

    public static void main(String[] args)
    {
        int[][] mat = {{1,0,0},{0,0,1},{1,0,0}};

        System.out.println(numSpecial(mat));
    }

    public static int numSpecial(int[][] mat)
    {
        int n = mat.length , m = mat[0].length;

        int[] rowNum = new int[n];
        int[] colNum = new int[m];

        for(int i = 0 ; i < n ; ++i)
        {
            for(int j = 0 ; j < m ; ++j)
            {
                if(mat[i][j] == 1)
                {
                    rowNum[i]++;
                    colNum[j]++;
                }
            }
        }
        int ans = 0;
        for(int i = 0 ; i < n ; ++i)
        {
            for(int j = 0 ; j < m ; ++j)
            {
                if(mat[i][j] == 1 && rowNum[i] == 1 && colNum[j] == 1)ans++;
            }
        }
        System.out.println(Arrays.toString(colNum));
        System.out.println(Arrays.toString(rowNum));

        return ans;
    }
}
