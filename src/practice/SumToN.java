/*
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */
package practice;

import java.util.Scanner;

public class SumToN {

	public static void main(String[] args) {
		int num = 0;

		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
		}

		int sum = 0;
		for (int i = num; i > 0; --i) {
			sum += i;
		}

		System.out.println(sum);
	}

}
