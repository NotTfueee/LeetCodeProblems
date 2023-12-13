package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 01/11/23,Wednesday

public class DeleteNodeInABST {

    public static void main(String[] args) {

        Integer[] tree = {5,3,6,2,4,null,7};

        System.out.println(TreeNode.print(delete(TreeNode.constructTree(tree ) , 3)));
    }

    public static TreeNode delete(TreeNode root, int key)
    {
        if(root == null)return null;

        if(key == root.val)
        {
            if(root.left != null && root.right != null)
            {
                int lmax = max(root.right);
                root.val = lmax;
                root.right = delete(root.right , lmax);

                return root;
            }
            else if(root.left != null)return root.left;
            else return root.right;
        }
        else if(key > root.val)root.right = delete(root.right , key);
        else root.left = delete(root.left , key);

        return root;

    }

    public static int max(TreeNode root)
    {
        if(root.right == null)return root.val;
        else return max(root.right);
    }
}
