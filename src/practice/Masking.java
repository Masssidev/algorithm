/*
���� ����
���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
*/
package practice;

import java.util.Scanner;

public class Masking {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("��ȭ��ȣ�� �Է����ּ���: ");
			String phoneNumber = scanner.next();

			System.out.println(solution(phoneNumber));
		}
	}

	private static String solution(String phoneNumber) {
		StringBuilder sb = new StringBuilder();
		int length = phoneNumber.length();
		for(int i=0; i<length-4; ++i){
			sb.append("*");
		}
		sb.append(phoneNumber.substring(length-4));
		return sb.toString();
	}
}
