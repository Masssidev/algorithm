/*���ڿ� s�� ���̰� 4Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���.
������� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.

���� ����
s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
*/
package practice;

import java.util.Scanner;

public class HandleString {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("���ڿ��� �Է����ּ���: ");
			String s = scanner.next();

			System.out.println(solution(s));
		}
	}

	private static boolean solution(String s) {
		int length = s.length();
		if (length != 4 && length != 6)
			return false;
		for (int i = 0; i < length; ++i) {
			char c = s.charAt(i);
			if (c < '0' || c > '9')
				return false;

		}
		return true;
	}

}
