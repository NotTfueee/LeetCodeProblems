package Trees;

//File Created by -- > anuragbhatt
//Created On -- > 28/02/24,Wednesday

import java.util.ArrayDeque;

import static java.lang.System.out;

public class FindBottomLeftTreeValue {

    public static void main(String[] args) {

        Integer[] tree = {1,2,3,4,null,5,6,null,null,7};

        out.println(findBottomLeftValue(TreeNode.constructTree(tree)));
    }

    public static int findBottomLeftValue(TreeNode root)
    {
        var q = new ArrayDeque<TreeNode>();
        q.add(root);

        int ele = 0;

        while(!q.isEmpty())
        {
            int size = q.size() , c = 0;

            while(size-- > 0)
            {
                var top = q.remove();

                if(c == 0)
                {
                    ele = top.val;
                    c++;
                }

                if(top.left != null)q.add(top.left);
                if(top.right != null)q.add(top.right);
            }
        }

        return ele;
    }
}
