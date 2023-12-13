package Math;

//File Created by -- > anuragbhatt
//Created On -- > 05/12/23,Tuesday

public class CountOfMatchesInTournament {

    public static void main(String[] args) {

        System.out.println(numberOfMatches(200));
    }

    public static int numberOfMatches(int n )
    {
        int count = 0 ;

        while(n > 1)
        {
            if(n % 2 == 0 )
            {
                count += n / 2 ;
                 n = n / 2;
            }
            else
            {
                count += (n-1)/2;
                n = ((n-1)/2 )+1;
            }
        }

        return count;
    }
}
