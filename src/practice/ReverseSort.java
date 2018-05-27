/*
 * ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

���� ����
str�� ���� 1 �̻��� ���ڿ��Դϴ�.
 */
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSort {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("���ڿ��� �Է����ּ���: ");
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
