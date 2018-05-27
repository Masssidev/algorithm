/*
�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

���ѻ���
N�� ���� : 100,000,000 ������ �ڿ���
*/
package practice;

import java.util.Scanner;

public class PositionalNumberAddition {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("������ �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		int result = 0;
		String str = String.valueOf(num);
		int length = str.length();
		for (int i = 0; i < length; ++i) {
			result += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return result;
	}
}
