/*
 * �� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
