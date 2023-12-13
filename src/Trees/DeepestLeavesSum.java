package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 20/10/23,Friday

public class DeepestLeavesSum {

    public static void main(String[] args) {

        Integer[] tree = {6,7,8,2,7,1,3,9,null,1,4,null,null,null,5};
        System.out.println(deepestLeaveSum(TreeNode.constructTree(tree) ));
    }

    public static int deepestLeaveSum(TreeNode root)
    {
        int maxH = height(root);

        return sum (root , 0 , maxH);
    }

    public static int height (TreeNode root)
    {
        if(root == null)return -1;

        int left = height(root.left );
        int right = height(root.right);

        int h = Math.max(left , right) + 1;

        return h;
    }

    public static int sum(TreeNode root , int sum , int h)
    {
        if(root == null)return 0;

        if(h == 0 )
        {
            sum += root.val;
            return sum;
        }

        int left = sum(root.left , sum  , h - 1);
        int right = sum(root.right , sum , h-1);

        return left + right ;
    }

}
