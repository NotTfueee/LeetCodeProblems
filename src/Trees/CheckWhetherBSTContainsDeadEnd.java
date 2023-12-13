package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 01/12/23,Friday

public class CheckWhetherBSTContainsDeadEnd {

    public static void main(String[] args) {

        Integer[] tree = {8 ,5 ,9 ,7 ,2 ,1};

        System.out.println(isDeadEnd(TreeNode.constructTree(tree)));
    }

    public static boolean isDeadEnd(TreeNode root)
    {
        return traverse(root , 1 , Integer.MAX_VALUE);
    }

    public static boolean traverse(TreeNode root , int min , int max)
    {
        if(root == null)return false;

        if(root.left == null && root.right == null && min == max)return true;

        boolean left = traverse(root.left , min , root.val -1);
        boolean right = traverse(root.right , root.val+1 , max);

        return left || right;
    }
}
