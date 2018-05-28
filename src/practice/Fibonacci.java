/*
문제 설명
피보나치 수는 F(0) = 0, F(1) = 1일 때, 
1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 점화식입니다. 
2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, 
solution을 완성해 주세요.

제한 사항
* n은 1이상, 100000이하인 자연수입니다.
*/
package practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("자연수를 입력해주세요: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		return fibonacci(num) % 1234567;
	}

	private static int fibonacci(int num) {
		if (num <= 1)
			return num;
		else
			return fibonacci(num - 2) + fibonacci(num - 1);
	}
}
