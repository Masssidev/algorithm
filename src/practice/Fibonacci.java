/*
���� ����
�Ǻ���ġ ���� F(0) = 0, F(1) = 1�� ��, 
1 �̻��� n�� ���Ͽ� F(n) = F(n-1) + F(n-2) �� ����Ǵ� ��ȭ���Դϴ�. 
2 �̻��� n�� �ԷµǾ��� ��, n��° �Ǻ���ġ ���� 1234567���� ���� �������� �����ϴ� �Լ�, 
solution�� �ϼ��� �ּ���.

���� ����
* n�� 1�̻�, 100000������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�ڿ����� �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		return fibonacci(num) % 1234567;
	}

	private static int fibonacci(int num) {
		if (num <= 1)
			return num;
		else
			return fibonacci(num - 2) + fibonacci(num - 1);
	}
}
