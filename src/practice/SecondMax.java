/*
 * �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 */
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		try (Scanner scan = new Scanner(System.in)) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();
		}

		int[] numbers = { num1, num2, num3 };
		Arrays.sort(numbers);

		System.out.println(numbers[1]);
	}

}
