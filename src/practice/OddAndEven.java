/*
���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
num�� int ������ �����Դϴ�.
0�� ¦���Դϴ�.
*/
package practice;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("������ �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println((solution(num)));
		}
	}

	private static String solution(int num){
		return (num%2 == 0 ? "Even" : "Odd");
	}
}
