/*
����
����̴� ���� �������忡�� ������ ����ϰ� �ִ�.
����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�.
�������忡�� ����� ������ ������ ����� �ִ�.
������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�.
���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������,
5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� N�� �־�����. (3 �� N �� 5000)
���
����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
*/
package practice;

import java.util.Scanner;

public class SugarDelivery {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("������ �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		int count = 0;
		while (num >= 0 && num % 5 != 0) {
			num -= 3;
			count++;
		}
		if (num < 0)
			return -1;
		else
			return count + num / 5;
	}
}
