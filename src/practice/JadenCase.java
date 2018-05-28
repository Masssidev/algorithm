/*
문제 설명
JadenCase란 모든 단어의 첫 알파벳이 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상인 문자열입니다.
s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
*/
package practice;

import java.util.Scanner;

public class JadenCase {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("문자열을 입력해주세요: ");
			String str = scanner.nextLine();

			System.out.println(solution(str));
		}
	}

	private static String solution(String str) {
		String[] strArray = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArray.length; ++i) {
			sb.append(Character.toUpperCase(strArray[i].charAt(0)));
			sb.append(strArray[i].substring(1).toLowerCase());
			sb.append(" ");
		}
		return sb.toString();
	}
}
