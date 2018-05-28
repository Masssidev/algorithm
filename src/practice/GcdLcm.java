/*
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("두 수를 입력해주세요: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println(Arrays.toString(solution(num1, num2)));
		}
	}

	private static int[] solution(int num1, int num2) {
		return new int[] { gcd(num1, num2), lcm(num1, num2) };
	}

	private static int gcd(int num1, int num2) {
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int r = 1;
		while (r > 0) {
			r = num1 % num2;
			num1 = num2;
			num2 = r;
		}

		return num1;
	}

	private static int lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
}
