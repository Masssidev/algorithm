/*
�ڿ��� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
n�� 0 �̻� 3000������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Scanner;

public class CountDivisor {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("��� ������ ���� ������ �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		int result = 0;
		for (int i = 1; i <= num/2; ++i) {
			if (num % i == 0)
				result+=i;
		}
		return result+num;
	}
}
