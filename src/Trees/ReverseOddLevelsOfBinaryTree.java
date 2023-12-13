package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 31/10/23,Tuesday

public class ReverseOddLevelsOfBinaryTree {

    public static void main(String[] args) {

        Integer[] tree = {2,3,5,8,13,21,34};

        System.out.println(reverseOddLevels(TreeNode.constructTree(tree)));

    }

    public static TreeNode reverseOddLevels(TreeNode root)
    {
        var tree = reverse(root , 0);

        System.out.println(TreeNode.print(tree));
        return tree;
    }

    public static TreeNode reverse(TreeNode root , int level )
    {
        if(root == null)return null;

        var left = reverse(root.left , level + 1);
        var right = reverse(root.right , level + 1);

        var curr = new TreeNode(root.val);

        if(level % 2 == 0)
        {
            curr.left = right;
            curr.right = left;
        }
        else
        {
            curr.left = left ;
            curr.right = right;

        }

        return curr;
    }
}
