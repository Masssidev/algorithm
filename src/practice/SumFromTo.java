/*두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

제한 조건
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.
*/
package practice;

import java.util.Scanner;

public class SumFromTo {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("시작 정수를 입력해주세요: ");
			int from = scanner.nextInt();
			System.out.print("끝 정수를 입력해주세요: ");
			int to = scanner.nextInt();
			System.out.println(solution(from, to));
		}
	}

	private static int solution(int from, int to) {
		int result = 0;
		if (from > to) {
			int temp = 0;
			temp = from;
			from = to;
			to = temp;
		}
		for (int i = from; i <= to; ++i) {
			result += i;
		}
		return result;
	}

}
