/*
 * �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package practice;

import java.util.Scanner;

public class FromOneToN {

	public static void main(String[] args) {
		int num = 0;
		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
		}

		for (int i = 1; i <= num; ++i) {
			System.out.println(i);
		}
	}

}
