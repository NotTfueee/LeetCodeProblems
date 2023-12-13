package Array.SlidingWindow;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args)
    {
        int[] p = {7,1,5,3,6,4};
        System.out.println(bestTime(p));
    }

    public static int bestTime(int[] prices)
    {
        int min = prices[0] , maxProfit = 0 ;

        for(int i = 1 ; i < prices.length ; i ++) {
            int item = prices[i];

            if(min > item )
            {
                min = item;
            }
            else
            {
                maxProfit = Math.max(maxProfit , item - min);
            }
        }
        return maxProfit;
    }
}
