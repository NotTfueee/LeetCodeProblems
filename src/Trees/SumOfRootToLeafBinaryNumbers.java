package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 21/10/23,Saturday

import java.util.ArrayList;

public class SumOfRootToLeafBinaryNumbers {

    public static void main(String[] args) {

        Integer [] tree = {1,0,1,0,1,0,1};

        System.out.println(sumRootToLeaf(TreeNode.constructTree(tree)));
    }


    public static int sumRootToLeaf(TreeNode root) {

        if(root == null) return 0;

        var str = pathString(root , "");

        System.out.println(str);

        int sum = 0 ;

        for(String s : str)
        {
            sum += Integer.parseInt(s , 2);
        }

        return sum;
    }

    public static ArrayList<String> pathString(TreeNode root , String str)
    {
        var ans = new ArrayList<String>();

        if(root == null)return ans;

        if(root.left == null && root.right == null)
        {
            str += root.val;
            ans.add(str);
            return ans;
        }

        var left = pathString(root.left , str + root.val);
        var right = pathString(root.right , str + root.val);

        ans.addAll(left);
        ans.addAll(right);
        return ans;

    }


}
