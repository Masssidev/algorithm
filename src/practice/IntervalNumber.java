/*
문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

제한 조건
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class IntervalNumber {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("숫자를 입력해주세요: ");
			int x = scanner.nextInt();
			System.out.print("갯수를 입력해주세요: ");
			int num = scanner.nextInt();

			System.out.println(Arrays.toString(solution(x, num)));
		}
	}

	private static long[] solution(int x, int num) {
		long[] result = new long[num];
		result[0] = x;
		for (int i = 1; i < result.length; ++i) {
			result[i] = result[i-1] + x;
		}
		return result;
	}
}
