package Strings;

public class StringCompression {

    public static void main (String [] args)
    {
        String[] a = {"a","a","b","b","c","c","c","a","b","b","c"};
        System.out.println((compress(a)));
    }

    public static String compress(String[] arr)
    {
        String s = arr[0];
        int count = 1;

        for(int i = 1 ; i < arr.length ; i ++)
        {
            String prev = arr[i-1];
            String curr = arr[i];

            if(curr == prev)
            {
                count++;
            }
            else
            {
                if(count > 1 ) s += count;
                count = 1;
                s += curr;

            }
        }

        if(count > 1)
        {
            s += count;
            count = 1;
        }

        return s;
    }
}
