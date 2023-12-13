package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 24/10/23,Tuesday

public class DiameterOfTheTree {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5};

        System.out.println(diameterOfBinaryTree(TreeNode.constructTree(arr)));
    }

    public static class DiaPair
    {
        int dia;
        int height;
    }

    public static int diameterOfBinaryTree(TreeNode root) {

        var ans = diameter(root);

        return ans.dia;
    }

    public static DiaPair diameter(TreeNode root)
    {
        if(root == null)
        {
            DiaPair curr = new DiaPair();
            curr.dia = 0 ;
            curr.height = -1;

            return curr;
        }

        DiaPair left = diameter(root.left);
        DiaPair right = diameter(root.right);

        int f1 = left.height + right.height + 2;
        int f2 = Math.max(left.dia , right.dia);

        DiaPair ans = new DiaPair();
        ans.dia = Math.max(f1 ,f2);
        ans.height = Math.max(left.height , right.height) + 1;

        return ans;
    }
}
