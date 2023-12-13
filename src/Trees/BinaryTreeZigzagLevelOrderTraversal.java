package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 29/09/23,Friday


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {

    public static void main(String[] args) {

        Integer[] root = {3,9,20,null,null,15,7};
        System.out.println(zigzag(TreeNode.constructTree(root)));

    }

    public static List<List<Integer>> zigzag(TreeNode root)
    {

        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)return ans;

        var q = new ArrayDeque<TreeNode>();
        q.add(root);
        int zigzag = 0 ;

        while(!q.isEmpty())
        {
            int len = q.size() , i = 0 ;
            Integer[] arr = new Integer[len];

            while(len-- > 0 )
            {
                TreeNode currNode = q.remove();
                if(zigzag == 1)arr[len] = currNode.val;
                else
                {
                    arr[i] = currNode.val;
                    i++;
                }

                if(currNode.left != null)q.add(currNode.left);
                if(currNode.right != null)q.add(currNode.right);
            }

            zigzag = zigzag ^1;
            System.out.println(Arrays.toString(arr));
            var base = new ArrayList<Integer>(Arrays.asList(arr));
            ans.add(base);
        }

        return ans;

    }

}
