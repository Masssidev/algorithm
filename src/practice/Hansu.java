/*
 * � ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
 * ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
 * N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 */
package practice;

import java.util.Scanner;

public class Hansu {

	public static void main(String[] args) {
		int num = 0;
		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
		}

		int count = 0;
		for (int i = num; i > 0; --i) {
			if (isHansu(i))
				count++;
		}

		System.out.println(count);
	}

	private static boolean isHansu(int num) {
		String[] numbers = String.valueOf(num).split("");
		int dif = 0;
		if (numbers.length > 1)
			dif = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
		
		for (int i = 1; i < numbers.length - 1; ++i) {
			if (dif != Integer.parseInt(numbers[i]) - Integer.parseInt(numbers[i + 1]))
				return false;
		}
		return true;
	}
}
