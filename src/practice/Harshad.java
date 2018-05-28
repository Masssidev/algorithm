/*
���� ����
���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. ���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. �ڿ��� n�� �Է¹޾� n�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
n�� 1 �̻�, 10000 ������ �����Դϴ�.
*/
package practice;

import java.util.Scanner;

public class Harshad {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("������ �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static boolean solution(int num) {
		String[] strArray = String.valueOf(num).split("");
		int result = 0;
		for (String s : strArray) {
			result += Integer.parseInt(s);
		}
		return num % result == 0;
	}
}
