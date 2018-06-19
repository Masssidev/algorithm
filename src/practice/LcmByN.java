/*
���� ����
�� ���� �ּҰ����(Least Common Multiple)�� �Էµ� �� ���� ��� �� ������ �Ǵ� ���� ���� ���ڸ� �ǹ��մϴ�. 
���� ��� 2�� 7�� �ּҰ������ 14�� �˴ϴ�. ���Ǹ� Ȯ���ؼ�, n���� ���� �ּҰ������ n ���� ������ ��� �� ������ �Ǵ� ���� ���� ���ڰ� �˴ϴ�.
n���� ���ڸ� ���� �迭 arr�� �ԷµǾ��� �� �� ������ �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� �ּ���.

���� ����
arr�� ���� 1�̻�, 15������ �迭�Դϴ�.
arr�� ���Ҵ� 100 ������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Scanner;

public class LcmByN {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("����� ũ�⸦ �Է����ּ���: ");
			int size = scanner.nextInt();
			int[] matrix = new int[size];
			System.out.print("����� ��Ҹ� �Է����ּ���: ");
			for (int i = 0; i < matrix.length; ++i) {
				matrix[i] = scanner.nextInt();

			}

			System.out.println(solution(matrix));
		}
	}

	private static int solution(int[] matrix) {
		int result = matrix[0];
		for (int i = 1; i < matrix.length; ++i) {
			result = lcm(result, matrix[i]);
		}
		return result;
	}

	private static int lcm(int a, int b) {
		int temp1 = a;
		int temp2 = b;
		while (a != b) {
			if (a > b)
				a -= b;
			else
				b -= a;
		}
		return temp1 * temp2 / a;
	}
}
