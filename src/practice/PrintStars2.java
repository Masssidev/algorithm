/*
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����. 
 * ������, �������� �������� ������ ���� ����Ͻÿ�.
 */
package practice;

import java.util.Scanner;

public class PrintStars2 {

	public static void main(String[] args) {
		int num = 0;
		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
		}

		for (int i = 0; i < num; ++i) {
			for (int j = num - 1; j > i; --j) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; ++k) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
