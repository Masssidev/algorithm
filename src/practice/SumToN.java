/*
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package practice;

import java.util.Scanner;

public class SumToN {

	public static void main(String[] args) {
		int num = 0;

		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
		}

		int sum = 0;
		for (int i = num; i > 0; --i) {
			sum += i;
		}

		System.out.println(sum);
	}

}
