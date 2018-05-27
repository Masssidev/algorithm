/*
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class IntToArray {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("정수를 입력해주세요: ");
			int num = scanner.nextInt();

			System.out.println(Arrays.toString(solution(num)));
		}
	}

	private static int[] solution(int num) {
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		int length = sb.length();
		int[] resultArray = new int[length];
		for (int i = 0; i < length; ++i) {
			resultArray[i] = Integer.parseInt(sb.reverse().toString().substring(i, i + 1));
		}
		return resultArray;
	}

}
