/*
���� ����
JadenCase�� ��� �ܾ��� ù ���ĺ��� �빮���̰�, �� ���� ���ĺ��� �ҹ����� ���ڿ��Դϴ�. ���ڿ� s�� �־����� ��, s�� JadenCase�� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 1 �̻��� ���ڿ��Դϴ�.
s�� ���ĺ��� ���鹮��(" ")�� �̷���� �ֽ��ϴ�.
*/
package practice;

import java.util.Scanner;

public class JadenCase {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("���ڿ��� �Է����ּ���: ");
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
