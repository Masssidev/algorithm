/*
���� ����
Finn�� ���� ���а��ο� ���� �ֽ��ϴ�. 
���� ���θ� �ϴ� Finn�� �ڿ��� n�� ������ �ڿ������ ǥ�� �ϴ� ����� ��������� ����� �˰� �Ǿ����ϴ�. 
������� 15�� ������ ���� 4������ ǥ�� �� �� �ֽ��ϴ�.

1 + 2 + 3 + 4 + 5 = 15
4 + 5 + 6 = 15
7 + 8 = 15
15 = 15
�ڿ��� n�� �Ű������� �־��� ��, ���ӵ� �ڿ������ n�� ǥ���ϴ� ����� ���� return�ϴ� solution�� �ϼ����ּ���.

���ѻ���
n�� 10,000 ������ �ڿ��� �Դϴ�.
*/
package practice;

import java.util.Scanner;

public class ExpressionOfNumber {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�ڿ����� �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		int count = 0;
		for (int i = 1; i <= num; i += 2) {
			if (num % i == 0)
				count++;
		}
		return count;
	}
}
