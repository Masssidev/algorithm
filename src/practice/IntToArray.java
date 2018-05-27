/*
�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

���� ����
n�� 10,000,000,000������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class IntToArray {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("������ �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(Arrays.toString(solution(num)));
		}
	}

	private static int[] solution(int num) {
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		int length = sb.length();
		int[] resultArray = new int[length];
		for (int i = 0; i < length; ++i) {
			resultArray[i] = Integer.parseInt(sb.reverse().toString().substring(i, i + 1));
		}
		return resultArray;
	}

}
