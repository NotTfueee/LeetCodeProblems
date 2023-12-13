package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 21/10/23,Saturday

public class gfgMaximumSumLeafToRootPath {

    public static void main(String[] args) {

        Integer[] tree = {10,null ,-20,-30};

        System.out.println(max(TreeNode.constructTree(tree) , 0));

    }

    public static int max(TreeNode root , int sum)
    {
        if(root == null)return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        if(root.left == null && root.right == null)
        {
            sum += root.val;
            max = Math.max(max , sum);
            return max;
        }

        int left = max(root.left , sum + root.val);
        int right = max(root.right , sum + root.val);


        return Math.max(left , right );
    }
}
