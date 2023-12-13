package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 24/10/23,Tuesday

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class FindLargestValueInEachTreeRow {

    public static void main(String[] args) {
        Integer[] arr = {1,3,2,5,3,null,9};

        System.out.println(largestValues(TreeNode.constructTree(arr)));
    }

    public static List<Integer> largestValues(TreeNode root) {

        if(root == null)return new ArrayList<>();

        var ans = new ArrayList<Integer>();

        var q = new ArrayDeque<TreeNode>();
        q.add(root);

        while(!q.isEmpty())
        {
            int len = q.size() , max = Integer.MIN_VALUE;

            while (len-- > 0)
            {
                TreeNode curr = q.remove();

                max = Math.max(max , curr.val);

                if(curr.left != null)q.add(curr.left);
                if(curr.right != null)q.add(curr.right);
            }
            ans.add(max);
        }

        return ans;
    }
}
