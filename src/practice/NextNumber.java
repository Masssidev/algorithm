/*
���� ����
�ڿ��� n�� �־����� ��, n�� ���� ū ���ڴ� ������ ���� ���� �մϴ�.

���� 1. n�� ���� ū ���ڴ� n���� ū �ڿ��� �Դϴ�.
���� 2. n�� ���� ū ���ڿ� n�� 2������ ��ȯ���� �� 1�� ������ �����ϴ�.
���� 3. n�� ���� ū ���ڴ� ���� 1, 2�� �����ϴ� �� �� ���� ���� �� �Դϴ�.
���� �� 78(1001110)�� ���� ū ���ڴ� 83(1010011)�Դϴ�.

�ڿ��� n�� �Ű������� �־��� ��, n�� ���� ū ���ڸ� return �ϴ� solution �Լ��� �ϼ����ּ���.

���� ����
n�� 1,000,000 ������ �ڿ��� �Դϴ�.
*/
package practice;

import java.util.Scanner;

public class NextNumber {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�ڿ����� �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}
	
	private static int solution(int num) {
		int countOfOne = Integer.bitCount(num);
		while(true) {
			if(Integer.bitCount(++num) == countOfOne)
				return num;
		}
	}
}
