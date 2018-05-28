/*
�� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. 
�迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.

���� ����
�� ���� 1�̻� 1000000������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�� ���� �Է����ּ���: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println(Arrays.toString(solution(num1, num2)));
		}
	}

	private static int[] solution(int num1, int num2) {
		return new int[] { gcd(num1, num2), lcm(num1, num2) };
	}

	private static int gcd(int num1, int num2) {
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int r = 1;
		while (r > 0) {
			r = num1 % num2;
			num1 = num2;
			num2 = r;
		}

		return num1;
	}

	private static int lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
}
