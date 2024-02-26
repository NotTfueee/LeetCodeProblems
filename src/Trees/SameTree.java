package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 26/02/24,Monday

import static java.lang.System.out;

public class SameTree {

    public static void main(String[] args) {

        Integer[] a = {1,1};
        Integer[] b = {1,null,1};

        out.println(isSameTree(TreeNode.constructTree(a) , TreeNode.constructTree(b)));

    }

    public static StringBuilder str ;

    public static boolean isSameTree(TreeNode p , TreeNode q)
    {
        str = new StringBuilder();

        traverse(p);
        StringBuilder s = new StringBuilder(str);
        str = new StringBuilder();
        traverse(q);

        return s.toString().contentEquals(str);
    }

    public static void traverse(TreeNode root)
    {
        if(root == null)
        {
            str.append("null");
            return;
        }

        str.append(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
