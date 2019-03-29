/*
���� ����
JadenCase�� ��� �ܾ��� ù ���ĺ��� �빮���̰�, �� ���� ���ĺ��� �ҹ����� ���ڿ��Դϴ�. ���ڿ� s�� �־����� ��, s�� JadenCase�� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 1 �̻��� ���ڿ��Դϴ�.
s�� ���ĺ��� ���鹮��(" ")�� �̷���� �ֽ��ϴ�.
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
