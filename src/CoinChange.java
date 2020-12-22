import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount){
        int max = amount + 1;
        int[] dp = new int[amount + 1];
//        set all the value in int[] dp to max number
        Arrays.fill(dp,max);
        dp[0] = 0;
        for(int i = 1; i <= amount ; i++){
            for(int j = 0; j < coins.length; j++){
//                if the coins value smaller than the amount, it will work
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i],dp[i - coins[j]]+1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        CoinChange coin = new CoinChange();
        System.out.println(coin.coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coin.coinChange(new int[] {2}, 3));
        System.out.println(coin.coinChange(new int[] {1}, 0));
        System.out.println(coin.coinChange(new int[] {1}, 1));
        System.out.println(coin.coinChange(new int[] {1}, 2));
    }

}


