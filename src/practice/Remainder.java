/*
 * ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C, ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.
 * �� �� A, B, C�� �־����� ��, ���� �װ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
