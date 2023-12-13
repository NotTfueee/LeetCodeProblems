package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 20/11/23,Monday

public class KSumPaths {

    public static void main(String[] args) {

        Integer[] arr = {-1,-2,-1 ,2 ,null ,null, null ,2 ,1 ,-1, null, null, null, -1 ,null, null, null};

        System.out.println(sumK(TreeNode.constructTree(arr) , 0));
    }

    public static int sumK(TreeNode root , int k )
    {
        int count = 0 ;
        ways(root , k , 0 , count );

        return count;
    }

    public static void ways(TreeNode root , int k , int sum , int count )
    {

    }
}
