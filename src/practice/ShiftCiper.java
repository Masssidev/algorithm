/*
���� ����
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.
 ���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. 
 ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

���� ����
������ �ƹ��� �о �����Դϴ�.
s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
s�� ���̴� 8000�����Դϴ�.
n�� 1 �̻�, 25������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Scanner;

public class ShiftCiper {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�̵���ų ���ڿ��� �Է����ּ���: ");
			String s = scanner.nextLine();
			System.out.print("�̵���ų ���� �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(s, num));
		}
	}

	private static String solution(String s, int num) {
		StringBuilder sb = new StringBuilder();
		int stringSize = s.length();
		for (int i = 0; i < stringSize; ++i) {
			char c = s.charAt(i);
			if (c != ' ') {
				if (Character.isLowerCase(c))
					c = (char) ((c - 'a' + num) % 26 + 'a');
				else if (Character.isUpperCase(c))
					c = (char) ((c - 'A' + num) % 26 + 'A');
			}
			sb.append(c);
		}
		return sb.toString();
	}
}
