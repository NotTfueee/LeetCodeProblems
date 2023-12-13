package Recursion.DynamicProgramming;

public class MinimumCostPaths {

    public static void main(String[] args)
    {
        int[][] a = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPath(a));
    }

    public static int minPath(int[][] grid)
    {
        int n = grid.length , m = grid[0].length ;
        int [][] memo = new int[n][m];

        for(int i = memo.length - 1 ; i >= 0 ; i --)
        {
            for(int j = memo[0].length - 1 ; j >= 0 ; j --)
            {
                 /*
                 if i am in the bottom right cell then the min
                 cost will be equal to the cost of the grid cost of the last bottom cell of the grid
                  */
                if(i == n-1 && j == m - 1)
                {
                    memo[i][j] = grid[i][j];
                }
                else if(i == n - 1)
                {
                     /*
                     eg i am at the last row and the second last column then
                    for that cell the only direction i can move in is right
                    the cost from that cell to the last cell would be the cost of current
                    cell added to the min cost of the right cell in memo grid
                      */
                    memo[i][j] = memo[i][j+1] + grid[i][j];
                }
                else if ( j == m - 1)
                {
                    /*
                     if i am the last column of each row then i can only move down in the grid
                     as in memo grid we are moving from down to up as we're solving the smaller
                     problem to bigger problem so when we are at the last column of eadch row
                     the min cost from that cell to last cell would be the sum of current grid plus the
                      cost of  the last column of the next row
                     */

                    memo[i][j] = memo[i+1][j] + grid[i][j];
                }
                else
                {
                    /*
                     and for the remaining grid we can move either down or right but we need to the min
                     cost so we take the min cost of the 2 cells the next row and the nexxt col
                     */

                    memo[i][j] = Math.min(memo[i+1][j],memo[i][j+1])+grid[i][j];
                }
            }

        }
        return memo[0][0];
    }
}
