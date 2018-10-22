/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
package practice;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

			int num1 = scan.nextInt();
			int num2 = scan.nextInt();

			System.out.println(num1 + num2);
		}
	}
}
