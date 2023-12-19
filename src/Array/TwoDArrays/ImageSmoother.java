package Array.TwoDArrays;

//File Created by -- > anuragbhatt
//Created On -- > 19/12/23,Tuesday

import java.util.Arrays;

public class ImageSmoother {

    public static void main(String[] args) {

        int[][] img = { {100, 200 ,100} , {200 , 50 , 200} , {100 , 200, 100}};

        System.out.println(Arrays.deepToString(imageSmoother(img)));
    }

    public static int[][] imageSmoother(int[][] img)
    {
        int n = img.length , m = img[0].length;
        int[][] ans = new int [n][m];
        int[] moves = new int[]{-1 , 0 , 1};

        for(int i = 0 ; i < n  ; ++i)
        {
            for(int j = 0 ; j < m ; ++j)
            {
                int count = 0 , val = 0;

                for(int a : moves)
                {
                    for(int b : moves)
                    {
                        int x = i + a;
                        int y = j + b;

                        if(x < 0 || y < 0 || x >= n || y >= m)continue;

                        count ++;
                        val += img[x][y];
                    }
                }

                ans[i][j] = val / count;
            }
        }

        return ans;
    }
}

