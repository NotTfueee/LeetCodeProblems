package Array;

//File Created by -- > anuragbhatt
//Created On -- > 05/10/23,Thursday

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

    public static void main(String[] args) {

        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorElement(arr));
    }

    public static List<Integer> majorElement(int[] nums) {

        Integer m1 = null , m2 = null ;
        int c1 = 0 , c2 = 0 , n = nums.length;
        var ans = new ArrayList<Integer>();

        for(int num : nums)
        {
            if(m1 != null && num == m1)c1++;
            else if(m2 != null && num == m2)c2++;
            else if(m1 == null)
            {
                m1 = num;
                c1 = 1;
            }
            else if(m2 == null)
            {
                m2 = num;
                c2 = 1;
            }
            else
            {
                --c1;
                --c2;
            }

            if(c1 == 0 )m1 = null;
            else if(c2 == 0 )m2 = null;
        }

        c1 = 0 ;
        c2 = 0 ;

        for(int num : nums)
        {
            if(m1 != null && num == m1)c1++;
            else if(m2 != null && num == m2)c2++;
        }

        if(c1 > n/3)ans.add(m1);
        if(c2 > n/3)ans.add(m2);

        return ans;
    }
}
