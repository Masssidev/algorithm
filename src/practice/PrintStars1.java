/*
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 */
package practice;

import java.util.Scanner;

public class PrintStars1 {

	public static void main(String[] args) {
		int num = 0;
		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
		}

		for (int i = 0; i < num; ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
