//Best time to sell ans buy
package Mainjava;
public class Question6{
    public static int Besttimesellansbuy(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int max =0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                int Profit = prices[i] - minPrice;
                max = Math.max(max , Profit);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
         int result = Besttimesellansbuy(prices);
        System.out.println(result);

    }
}