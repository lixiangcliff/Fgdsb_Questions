package Coin_Change_Problem;

import java.util.Arrays;

public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2, 5, 10};
		int target = 1;
		Question q = new Question();
		System.out.println(q.min_coins(coins, target));
	}
	
	/**
	 * Given a set of currency denominations, find the minimum number of coins needed to represent an amount.
	 * Return 0 if you can't use your coins to represent the target amount.
	 * For example:
	 * Suppose you have two kinds of coins: 1, 2. In order to represent 3, you have two options:
	 * 1 + 1 + 1 = 3 or
	 * 
	 * 1 + 2 = 3
	 * So the minimum number of coins is 2.
	 */
	
	//there might be something wrong in test case
    public int min_coins(int[] coins, int target) {
    	if (coins == null || coins.length == 0 || target <= 0) {
    		return 0;
    	}
    	Arrays.sort(coins);
    	int count = 0;
    	int pos = coins.length - 1;
    	while (target > 0) {
    		while (target - coins[pos] >= 0) {
    			target -= coins[pos];
    			count++;
    			if (target == 0) {
        			return count;
    			}
    		}
			if (pos == 0) {
				break;
			} else {
				pos--;
			}
    	}
    	return 0;
    }

}
