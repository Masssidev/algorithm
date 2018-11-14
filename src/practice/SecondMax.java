/*
 * 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 */
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		try (Scanner scan = new Scanner(System.in)) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();
		}

		int[] numbers = { num1, num2, num3 };
		Arrays.sort(numbers);

		System.out.println(numbers[1]);
	}

}
