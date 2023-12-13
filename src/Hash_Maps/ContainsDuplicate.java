package Hash_Maps;

import java.util.HashMap;

public class ContainsDuplicate {

    public  static void main(String[] args)
    {
        int[] a = {1,2,3,1};
        System.out.println(dup(a));
    }

    public static boolean dup(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i ++)
        {
            int item = nums[i];

            if(map.containsKey(item))
            {
                return true;
            }
            else
            {
                map.put(item, 1);
            }
        }

        return false;
    }
}
