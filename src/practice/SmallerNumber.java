/*
 * ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
 * X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
 */
package practice;

import java.util.Scanner;

public class SmallerNumber {

	public static void main(String[] args) {
		int count = 0;
		int num = 0;

		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		num = scan.nextInt();

		int[] numbers = new int[count];
		for (int i = 0; i < numbers.length; ++i) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		for (int j = 0; j < numbers.length; ++j) {
			if (numbers[j] < num)
				System.out.println(numbers[j]);
		}
	}

}
