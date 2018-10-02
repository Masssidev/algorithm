package practice;

import java.util.Arrays;

public class FlipTheCoin {

	public static void main(String[] args) {
		int[] coins = {1, 0};
		Arrays.sort(coins);
		
		int count = 0;
		for(int i=0; i<coins.length; ++i) {
			if(coins[i] == 1)
				break;
			count++;
		}
		if(coins.length/2 >= count)
			System.out.println(count);
		else
			System.out.println(coins.length - count);
	}

}
