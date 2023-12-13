package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 26/10/23,Thursday

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,null,5};

        System.out.println(binaryTreePaths(TreeNode.constructTree(arr)));
    }

    public static List<String> binaryTreePaths(TreeNode root)
    {
        var ans = new ArrayList<String>();
        paths(root , "" , ans);
        return ans;
    }

    public static String paths (TreeNode root , String ans , List<String> paths)
    {
        if(root == null)return "";

        if(root.left == null && root.right == null)
        {
            ans += root.val;
            paths.add(ans);
            return ans;
        }

        String left = paths(root.left , ans +root.val + "->" , paths);
        String right = paths(root.right , ans + root.val + "->" , paths);

        return ans;
    }

}
