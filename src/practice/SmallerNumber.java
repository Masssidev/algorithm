/*
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 */
package practice;

import java.util.Scanner;

public class SmallerNumber {

	public static void main(String[] args) {
		int count = 0;
		int num = 0;

		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		num = scan.nextInt();

		int[] numbers = new int[count];
		for (int i = 0; i < numbers.length; ++i) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		for (int j = 0; j < numbers.length; ++j) {
			if (numbers[j] < num)
				System.out.println(numbers[j]);
		}
	}

}
