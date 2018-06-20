/*
���� ����
���� ���̰� 2�̰� ������ ���̰� 1�� ���簢������� Ÿ���� �ֽ��ϴ�. 
�� ���簢�� Ÿ���� �̿��Ͽ� ������ ���̰� 2�̰� ������ ���̰� n�� �ٴ��� ���� ä����� �մϴ�. 
Ÿ���� ä�� ���� ������ ���� 2���� ����� �ֽ��ϴ�.

Ÿ���� ���η� ��ġ �ϴ� ���
Ÿ���� ���η� ��ġ �ϴ� ���

���簢���� ������ ���� n�� �Ű������� �־��� ��, �� ���簢���� ä��� ����� ���� return �ϴ� solution �Լ��� �ϼ����ּ���.

���ѻ���
������ ���� n�� 60,000������ �ڿ��� �Դϴ�.
����� ���� ���� �� �� �����Ƿ�, ����� ���� 1,000,000,007���� ���� �������� return���ּ���.
*/
package practice;

import java.util.Scanner;

public class TilingBy2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�ڿ����� �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		return fibonacci(num);
	}

	private static int fibonacci(int num) {
		int temp1 = 1;
		int temp2 = 1;
		for (int i = 0; i < num - 1; ++i) {
			int temp3 = (temp1 + temp2) % 1000000007;
			temp1 = temp2;
			temp2 = temp3;
		}
		return temp2;

	}
}
