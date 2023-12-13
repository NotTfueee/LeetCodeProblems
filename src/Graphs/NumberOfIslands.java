package Graphs;

//File Created by -- > anuragbhatt
//Created On -- > 14/11/23,Tuesday

public class NumberOfIslands {

    public static void main(String[] args) {

        char[][] arr = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        System.out.println(numberOfIsland(arr));
    }

    public static int numberOfIsland(char[][] grid)
    {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int ans = 0 ;
        for(int i = 0 ;i < grid.length ; ++i)
        {
            for(int j = 0 ; j < grid[i].length ; ++j)
            {
                if(!visited[i][j] && grid[i][j] == '0')
                {
                    connectedComponents(grid , i , j , visited);
                    ans ++;
                }
            }
        }

        return ans;
    }

    public static void connectedComponents(char[][] grid , int i , int j,  boolean[][] visited)
    {

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '1' || visited[i][j] )return ;

        visited[i][j] = true;

        // move upward
        connectedComponents(grid , i - 1 , j , visited);

        //move right-side
        connectedComponents(grid , i , j + 1 , visited);

        //move left-side
        connectedComponents(grid , i , j - 1 , visited);

        //move downwards
        connectedComponents(grid ,i + 1 , j , visited);

    }
}
