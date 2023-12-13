package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 27/10/23,Friday

public class BalancedBinaryKid {

    public static void main(String[] args) {

        Integer[] arr = {1,2,2,3,null,null,3,4,null,null,4};
        System.out.println(isBalanced(TreeNode.constructTree(arr)));
    }

    public static class balPair
    {
        int h;
        boolean isBalance;

    }
    public static boolean isBalanced(TreeNode root)
    {
        if(root == null)return true;

        var obj = helper(root);

        return obj.isBalance;
    }

    public static balPair helper(TreeNode root)
    {
        if(root == null)
        {
            var base = new balPair();
            base.h = -1;
            base.isBalance = true;
            return base;
        }

        var left = helper(root.left);
        var right = helper(root.right);

        var curr = new balPair();
        curr.h = Math.max(left.h , right.h )+ 1;

        if(left.isBalance && right.isBalance)
        {
            curr.isBalance = (int) Math.abs(left.h - right.h) <= 1;
        }
        else curr.isBalance = false;

        return curr;
    }
}
