/*
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수
*/
package practice;

import java.util.Scanner;

public class PositionalNumberAddition {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("정수를 입력해주세요: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		int result = 0;
		String str = String.valueOf(num);
		int length = str.length();
		for (int i = 0; i < length; ++i) {
			result += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return result;
	}
}
