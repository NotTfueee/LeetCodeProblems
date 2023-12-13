package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 22/10/23,Sunday

public class PathSum {

    public static void main(String[] args) {

        Integer[] arr = {5,4,8,11,null,13,4,7,2,null,null,null,1};

        System.out.println(pathSum(TreeNode.constructTree(arr) , 22));

    }

    public static boolean pathSum(TreeNode root , int targetSum)
    {
        if(root == null)return false;

        if(root.left == null && root.right == null)
        {
            targetSum -= root.val;

            if(targetSum == 0 )return true;
        }

        if(pathSum(root.left , targetSum - root.val))return true;
        if(pathSum(root.right , targetSum - root.val )) return true;

       return false;
    }

    public static boolean sum(TreeNode root , int targetSum , int sum)
    {
        if(root == null)return false;

        if(root.left == null && root.right == null)
        {
            sum += root.val ;

            if(sum == targetSum)return true;
        }

        if(sum(root.left , targetSum , sum + root.val))return true;
        if(sum(root.right , targetSum , sum + root.val)) return true;

        return false;
    }
}
