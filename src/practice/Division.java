/*
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 */
package practice;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		
		try(Scanner scan = new Scanner(System.in)) {
			num1 = scan.nextDouble();
			num2 = scan.nextDouble();
		}
		
		System.out.println(num1 / num2);
	}
}
