package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 14/12/23,Thursday

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PrintAllNodesThatDontHaveSiblings {

    public static void main(String[] args) {

        Integer[] tree = {37 , 20 , null , 113};
        System.out.println(noSiblings(TreeNode.constructTree(tree)));
    }

    public static ArrayList<Integer> noSiblings(TreeNode root)
    {
        var ans = new ArrayList<Integer>();
        var set = new HashSet<Integer>();

        find(root , set);

        if(set.isEmpty())
        {
            ans.add(-1);
            return ans;
        }

        ans.addAll(set);
        Collections.sort(ans);
        return ans;
    }

    public static void find(TreeNode root , HashSet<Integer> ans)
    {
        if(root == null)return ;

        if(root.left != null && root.right == null)ans.add(root.left.val);
        else if(root.left == null && root.right != null)ans.add(root.right.val);

        find(root.left , ans);
        find(root.right ,ans);
    }
}
