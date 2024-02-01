package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 25/01/24,Thursday

public class Pseudo_PalindromicPathsInABinaryTree {

    public static void main(String[] args) {

        Integer[] arr = {2,1,1,1,3,null,null,null,null,null,1};

        System.out.println(pseudoPalindromicPaths(TreeNode.constructTree(arr)));
    }

    private static int count = 0;
    public static int pseudoPalindromicPaths(TreeNode root)
    {
        path(root , "");
        return count;
    }

    public static void path(TreeNode root , String path)
    {
        if(root == null)return ;

        if(root.left == null && root.right == null)
        {
            path += root.val;

            if(canPalindrome(path))count++;
        }

        path(root.left , path + root.val);
        path(root.right , path +root.val);

    }

    public static boolean canPalindrome(String s)
    {
        int[] f = new int[10];

        for(int i = 0 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);
            f[item - '0']++;
        }

        int odd = 0;
        for(int i = 0 ; i < 10 ; ++i)
        {
            if(f[i] % 2 != 0)odd++;
        }

        if(s.length() % 2 == 0)
        {
            return odd == 0;
        }
        else return odd ==1;
    }
}
