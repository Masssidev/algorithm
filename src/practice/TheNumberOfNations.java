/*
���� ����
124 ���� �ֽ��ϴ�. 124 ���󿡼��� 10������ �ƴ� ������ ���� �ڽŵ鸸�� ��Ģ���� ���� ǥ���մϴ�.

124 ���󿡴� �ڿ����� �����մϴ�.
124 ���󿡴� ��� ���� ǥ���� �� 1, 2, 4�� ����մϴ�.
�ڿ��� n�� �Ű������� �־��� ��, n�� 124 ���󿡼� ����ϴ� ���ڷ� �ٲ� ���� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
n�� 500,000,000������ �ڿ��� �Դϴ�.
*/
package practice;

import java.util.Scanner;

public class TheNumberOfNations {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�ڿ����� �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static String solution(int num) {
		StringBuilder sb = new StringBuilder();
		while (num > 3) {
			sb.append(num % 3);
			num = (num % 3 == 0) ? (num - 1) / 3 : num / 3;
		}

		sb.append(num % 3);
		return sb.reverse().toString().replace('0', '4');
	}
}
