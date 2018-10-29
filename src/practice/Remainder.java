/*
 * 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
 * 세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.
 */
package practice;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		try (Scanner scan = new Scanner(System.in)) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();
		}

		System.out.println((num1 + num2) % num3);
		System.out.println((num1 % num3 + num2 % num3) % num3);
		System.out.println((num1 * num2) % num3);
		System.out.println((num1 % num3 * num2 % num3) % num3);
	}

}
