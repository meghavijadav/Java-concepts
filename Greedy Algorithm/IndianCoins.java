import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 200};
        Arrays.sort(coins, Comparator.reverseOrder());
        int coinCount = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if(coins[i] <= amount){
                while (coins[i] <= amount){
                    coinCount++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Minimum coins to pay the amount = " + coinCount);
        System.out.println(ans);
    }
}
