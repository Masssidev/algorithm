/*
 * ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
 */
package practice;

import java.util.Scanner;

public class PrintStars3 {

	public static void main(String[] args) {
		int num = 0;
		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
		}

		for (int i = 0; i < num; ++i) {
			for (int j = num; j > i; --j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
