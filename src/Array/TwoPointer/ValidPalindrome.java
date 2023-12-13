package Array.TwoPointer;

public class ValidPalindrome {

    public static void main (String[] args)
    {
        System.out.println(valid(".,"));
    }

    public static boolean valid(String s)
    {
        s = s.toLowerCase();
        int left = 0 , right = s.length()-1;

        while(left < right)
        {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if((check(l) && check(r)))
            {
                if(l != r)return false;
                right--;
                left++;
            }
            else
            {
                while(!check(l) && left < right)
                {
                    left++;
                    l = s.charAt(left);
                }

                while(!check(r) && right > left)
                {
                    right--;
                    r = s.charAt(right);
                }
            }

        }
        return true;
    }

    public static boolean check(char c)
    {
        if((c >= 97 && c <= 122) || ( c >= 48 && c <= 57) )return true;
        else return false;
    }

}
