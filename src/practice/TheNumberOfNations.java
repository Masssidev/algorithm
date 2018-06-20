/*
문제 설명
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

제한사항
n은 500,000,000이하의 자연수 입니다.
*/
package practice;

import java.util.Scanner;

public class TheNumberOfNations {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("자연수를 입력해주세요: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static String solution(int num) {
		StringBuilder sb = new StringBuilder();
		while (num > 3) {
			sb.append(num % 3);
			num = (num % 3 == 0) ? (num - 1) / 3 : num / 3;
		}

		sb.append(num % 3);
		return sb.reverse().toString().replace('0', '4');
	}
}
