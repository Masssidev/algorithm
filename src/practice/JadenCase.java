/*
문제 설명
JadenCase란 모든 단어의 첫 알파벳이 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상인 문자열입니다.
s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
*/
package practice;

import java.util.regex.Pattern;

public class JadenCase {

	public static void main(String[] args) {
		JadenCase theJadenCase = new JadenCase();
		String s = "3people unFollowed me";
		System.out.println(theJadenCase.solution(s));
	}

	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 0;

		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == ' ') {
				sb.append(" ");
				count = 0;
			} else if (Pattern.matches("^[0-9]*$", String.valueOf(s.charAt(i)))) {
				sb.append(String.valueOf(s.charAt(i)));
				count++;
			} else if (Pattern.matches("^[a-zA-Z]*$", String.valueOf(s.charAt(i)))) {
				if (count == 0) {
					sb.append(Character.toUpperCase(s.charAt(i)));
					count++;
				} else {
					sb.append(Character.toLowerCase(s.charAt(i)));
					count++;
				}
			}
		}
		return sb.toString();
	}
}
