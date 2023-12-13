package Strings;

public class RepeatedSubstringPattern {

    public static void main (String [] args)
    {
        System.out.println(is("aba"));
    }

    public static boolean is(String s)
    {
        String str = "";
        for(int i = 0 ;i < s.length() ; i ++) {

            str += s.charAt(i);
            int a = s.length();
            int b = str.length();

            if ((a%b) == 0)
            {
                int n = a/b;

                int k = 0 ;
                String spare = "";
                while(k < n )
                {
                    spare = spare + str;
                    k++;
                }

                if(spare.equals(s))return true;
            }
        }

        return false;
    }


}
