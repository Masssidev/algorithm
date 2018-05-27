/*
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
 */
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSort {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("문자열을 입력해주세요: ");
			String s = scanner.next();

			System.out.println(solution(s));
		}
	}

	private static String solution(String s) {
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new StringBuilder(new String(charArray)).reverse().toString();
	}

}
