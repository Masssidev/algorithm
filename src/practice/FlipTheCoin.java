/*
 * 동전 앞면 뒷면을 0과 1로 표현한 배열이 주어진다.
 * 동전들을 뒤집어 보이는 면을 통일 시킬 때 뒤집어야 할 동전의 최소 개수는?
 */
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
