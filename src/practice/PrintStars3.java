/*
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
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
