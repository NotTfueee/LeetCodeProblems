package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 02/11/23,Thursday

public class BinarySearchTreeToGreaterSumTree {

    public static void main(String[] args) {

        Integer[] tree = {4,1,6,0,2,5,7,null,null,null,3,null,null,null,8};

        System.out.println(TreeNode.print(bstToGst(TreeNode.constructTree(tree))));
    }

     static int sum = 0;
    public static TreeNode bstToGst(TreeNode root)
    {
        if(root == null)return null;

        bstToGst(root.right);

        sum += root.val;
        root.val = sum;

        bstToGst(root.left);

        return root;
    }
}
