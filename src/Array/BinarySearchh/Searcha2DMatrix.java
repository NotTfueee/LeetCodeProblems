package Array.BinarySearchh;

public class Searcha2DMatrix {

    public static void main(String[] args)
    {
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(search(a , 3));
    }

    public static boolean search(int[][] matrix , int target)
    {
        int i = 0 ;
        int j = matrix[i].length-1;

        while(i < matrix.length && j >= 0)
        {
            if(target == matrix[i][j])return true;
            else if (target > matrix[i][j])i++;
            else j--;
        }

        return false;
    }
}
