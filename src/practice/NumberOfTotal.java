/*
 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
 */
package practice;

import java.util.Scanner;

public class NumberOfTotal {

	public static void main(String[] args) {
		int count = 0;
		String numbers;

		try (Scanner scan = new Scanner(System.in)) {
			count = scan.nextInt();
			numbers = scan.next();
		}

		int total = 0;
		for (int i = 0; i < count; ++i) {
			total += numbers.charAt(i) - '0';
		}

		System.out.println(total);
	}

}
