public class buyAndSellStock{

    public static int profit(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0 ; i<prices[i] ; i++){
            int sellPrice = prices[i];
            int profit = 0 ;
            if(buyPrice < sellPrice){
                profit = sellPrice - buyPrice;
                maxProfit = Math.max(profit , maxProfit);
            } else{
                buyPrice = sellPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.print(profit(prices));
    }
}