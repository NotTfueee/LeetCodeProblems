package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 22/01/24,Monday

import java.util.ArrayList;

public class PathFromRootWithSpecifiedSum {
    public static void main(String[] args) {

        Integer[] arr = {1 ,20 ,3 ,null ,null ,4 ,15 ,6 ,7 ,8 ,9};

        System.out.println(printPaths(TreeNode.constructTree(arr) , 8));

    }

    public static ArrayList<ArrayList<Integer>> printPaths(TreeNode root , int sum)
    {
        var ans = new ArrayList<ArrayList<Integer>>();

        find(root , sum , ans , new ArrayList<>());

        return ans;
    }

    public static void find(TreeNode root , int sum , ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> path )
    {

        if(root == null) return;

        path.add(root.val);

        sum -= root.val;

        if(sum == 0)
        {
            ans.add(new ArrayList<>(path));
        }

        find(root.left , sum ,  ans , path );
        find(root.right , sum , ans , path );

        // if the sum path was not found remove the added node from the path arraylist
        path.remove(path.size() -1);

    }
}
