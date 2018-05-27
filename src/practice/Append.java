/*���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
    ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.

���� ����
n�� ���� 10,000������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Scanner;

public class Append {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("������ �Է����ּ���: ");
			int length = scanner.nextInt();

			System.out.println(solution(length));
		}
	}

	private static String solution(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; ++i) {
			sb.append((i % 2 == 0 ? "��" : "��"));
		}
		return sb.toString();
	}

}
