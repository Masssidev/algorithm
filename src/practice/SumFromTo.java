/*�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

���� ����
a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
*/
package practice;

import java.util.Scanner;

public class SumFromTo {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("���� ������ �Է����ּ���: ");
			int from = scanner.nextInt();
			System.out.print("�� ������ �Է����ּ���: ");
			int to = scanner.nextInt();
			System.out.println(solution(from, to));
		}
	}

	private static int solution(int from, int to) {
		int result = 0;
		if (from > to) {
			int temp = 0;
			temp = from;
			from = to;
			to = temp;
		}
		for (int i = from; i <= to; ++i) {
			result += i;
		}
		return result;
	}

}
