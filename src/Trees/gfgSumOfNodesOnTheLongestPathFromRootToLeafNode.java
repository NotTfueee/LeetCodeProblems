package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 22/10/23,Sunday

public class gfgSumOfNodesOnTheLongestPathFromRootToLeafNode {

    public static void main(String[] args) {

        Integer[] arr = {7,1 ,10, null , 4 ,8 ,null, 2, 6, null, 9 ,null, 3 ,5};

        System.out.println(sumOfLongestRootToLeafNodePath(TreeNode.constructTree(arr)));

    }


    public static int sumOfLongestRootToLeafNodePath(TreeNode root )
    {
        int h = height(root);
        System.out.println(h);

        return sum(root , 0 , h);
    }

    public static int sum (TreeNode root , int sum , int h )
    {
        if(root == null)return 0;

        if(h == 0)
        {
            sum += root.val ;
            return sum;
        }
        if(root.left == null && root.right == null && h != 0)return 0;

        int left = sum(root.left , sum + root.val , h - 1);
        int right = sum(root.right , sum + root.val , h-1);

        return Math.max(left , right);
    }


    public static int height(TreeNode root)
    {
        if(root == null)return -1;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left , right )+1;
    }
}
