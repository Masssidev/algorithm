/*
 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 */
package practice;

import java.util.Scanner;

public class Hansu {

	public static void main(String[] args) {
		int num = 0;
		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
		}

		int count = 0;
		for (int i = num; i > 0; --i) {
			if (isHansu(i))
				count++;
		}

		System.out.println(count);
	}

	private static boolean isHansu(int num) {
		String[] numbers = String.valueOf(num).split("");
		int dif = 0;
		if (numbers.length > 1)
			dif = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
		
		for (int i = 1; i < numbers.length - 1; ++i) {
			if (dif != Integer.parseInt(numbers[i]) - Integer.parseInt(numbers[i + 1]))
				return false;
		}
		return true;
	}
}
