package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 08/12/23,Friday

public class ConstructStringFromBinaryTree {

    public static void main(String[] args) {

        Integer[] tree = {1,2,3 ,4};

        System.out.println(tree2str(TreeNode.constructTree(tree)));
    }


    public static String tree2str(TreeNode root)
    {
        return find(root);
    }

    public static String find(TreeNode root )
    {
        if(root == null)return "";

        String s = Integer.toString(root.val);

        if(root.left == null && root.right == null) return s;

        if(root.left != null) s += "(" + find(root.left) + ")";

        if(root.right != null) s += "(" + find(root.right) + ")";

        return s;
    }
}
