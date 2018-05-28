/*
���� ����
�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
n�� 1000 ������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class IntervalNumber {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("���ڸ� �Է����ּ���: ");
			int x = scanner.nextInt();
			System.out.print("������ �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(Arrays.toString(solution(x, num)));
		}
	}

	private static long[] solution(int x, int num) {
		long[] result = new long[num];
		result[0] = x;
		for (int i = 1; i < result.length; ++i) {
			result[i] = result[i-1] + x;
		}
		return result;
	}
}
