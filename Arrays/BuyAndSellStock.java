package Arrays;
public class BuyAndSellStock {
    public static void main(String [] args){
        int[] prices = {2, 4, 6, 8, 10, 5, 16, 15, 24, 19};
        int buyPrice = prices[0];
        int maxProfit=0;

        for(int i = 1;i<prices.length;i++){
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }

            int profit = prices[i]-buyPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        
       System.out.println(maxProfit); 
    }
    
    
}
