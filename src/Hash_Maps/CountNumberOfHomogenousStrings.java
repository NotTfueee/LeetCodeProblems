package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 09/11/23,Thursday

public class CountNumberOfHomogenousStrings {

    public static void main(String[] args) {

        System.out.println(countHomogenous("abbcccaacccbb"));
    }

    public static int countHomogenous(String s)
    {
        long ans = 0 ;
        int mod = (int) 1e9+7;

        String prev = s.charAt(0) + "";

        for(int i = 1 ; i < s.length() ; ++i)
        {
            char item = s.charAt(i);

            if(item == prev.charAt(prev.length()-1))
            {
                prev += item;
            }
            else
            {
                ans += (long) prev.length() * (prev.length() + 1) / 2;
                prev = "";
                prev += item;
            }
        }

        if(!prev.isEmpty())ans += (long) prev.length() * (prev.length() + 1) / 2;

        return (int)(ans%mod);
    }
}
