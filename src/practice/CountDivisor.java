/*
자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

제한 사항
n은 0 이상 3000이하인 자연수입니다.
*/
package practice;

import java.util.Scanner;

public class CountDivisor {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("약수 갯수를 구할 정수를 입력해주세요: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		int result = 0;
		for (int i = 1; i <= num/2; ++i) {
			if (num % i == 0)
				result+=i;
		}
		return result+num;
	}
}
