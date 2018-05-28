/*
임의의 정수 n에 대해, n이 어떤 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 정수입니다.
*/
package practice;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("정수를 입력해주세요: ");
			long num = scanner.nextLong();

			System.out.println(solution(num));
		}
	}

	private static long solution(long num) {
		double sqrt = Math.sqrt(num);
		return (long) ((sqrt % 1) == 0 ? (sqrt + 1) * (sqrt + 1) : -1);
	}

}
