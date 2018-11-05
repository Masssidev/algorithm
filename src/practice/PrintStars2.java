/*
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제. 
 * 하지만, 오른쪽을 기준으로 정렬한 별을 출력하시오.
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
