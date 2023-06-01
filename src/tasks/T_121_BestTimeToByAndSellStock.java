package tasks;

public class T_121_BestTimeToByAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProf = 0;
        int profIfSellToday;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            profIfSellToday = prices[i] - minPrice;
            if (profIfSellToday > maxProf)
                maxProf = profIfSellToday;
        }
        return maxProf;
    }
}
