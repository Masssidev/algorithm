/*
 * ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package practice;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int num = 0;

		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
		}

		if (num >= 90 && num <= 100)
			System.out.println("A");
		else if (num >= 80 && num <= 89)
			System.out.println("B");
		else if (num >= 70 && num <= 79)
			System.out.println("C");
		else if (num >= 60 && num <= 69)
			System.out.println("D");
		else
			System.out.println("F");

	}

}
