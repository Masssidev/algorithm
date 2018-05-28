/*
������ ���� n�� ����, n�� � ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
n�� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.

���� ����
n�� 1�̻�, 50000000000000 ������ �����Դϴ�.
*/
package practice;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("������ �Է����ּ���: ");
			long num = scanner.nextLong();

			System.out.println(solution(num));
		}
	}

	private static long solution(long num) {
		double sqrt = Math.sqrt(num);
		return (long) ((sqrt % 1) == 0 ? (sqrt + 1) * (sqrt + 1) : -1);
	}

}
