/*
����
2018�� �ڵ� �佺Ƽ���� ��Ȳ���� ���ֵ� �����̴�.

�ڵ� �佺Ƽ�� �����ڿ��� ȯ���� �λ縦 ��������!

�Է�
���� N(1 �� N �� 10)�� �Էµȴ�.

���
�Էµ� ������ŭ �ݺ��Ͽ� Welcome to Kakao Code Festival!�� �� �پ� ����Ѵ�.
*/
package practice;

import java.util.Scanner;

public class WelcomeToKakaoCodeFestival {

	public static void main(String[] args) {
		System.out.print("������ �Է��� �ּ���: ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			solution(num);
		}
	}

	private static void solution(int num) {
		StringBuilder sb = new StringBuilder("Welcome to Kakao Code Festival!");
		for (int i = 0; i < num - 1; ++i) {
			sb.append("\nWelcome to Kakao Code Festival!");
		}
		System.out.println(sb.toString());
	}
}

