/*
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 */
package practice;

import java.util.Scanner;

public class FourFundamentalRules {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;

		try (Scanner scan = new Scanner(System.in)) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
		}

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}

}
