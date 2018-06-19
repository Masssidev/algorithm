/*
���� ����
ȿ���̴� �ָ� �ٱ⸦ �����ϰ� �ֽ��ϴ�. ȿ���̴� �ѹ��� 1ĭ, �Ǵ� 2ĭ�� �� �� �ֽ��ϴ�. ĭ�� �� 4�� ���� ��, ȿ���̴�
(1ĭ, 1ĭ, 1ĭ, 1ĭ)
(1ĭ, 2ĭ, 1ĭ)
(1ĭ, 1ĭ, 2ĭ)
(2ĭ, 1ĭ, 1ĭ)
(2ĭ, 2ĭ)
�� 5���� ������� �� �� ĭ�� ������ �� �ֽ��ϴ�. �ָ��ٱ⿡ ���� ĭ�� �� n�� �־��� ��, ȿ���̰� ���� �����ϴ� ����� �� �������� �˾Ƴ�, 
���⿡ 1234567�� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ���� ��� 4�� �Էµȴٸ�, 5�� return�ϸ� �˴ϴ�.

���� ����
n�� 1 �̻�, 2000 ������ �����Դϴ�.
*/
package practice;

import java.util.Scanner;

public class LongJump {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("ĭ ���� �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		return (fibonacci(num) % 1234567);
	}

	private static int fibonacci(int num) {
		if (num <= 2)
			return num;
		else
			return fibonacci(num - 2) + fibonacci(num - 1);
	}
}
