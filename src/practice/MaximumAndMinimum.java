/*
���� ����
���ڿ� s���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�. str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� �̸� (�ּҰ�) (�ִ밪)������ ���ڿ��� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
������� s�� 1 2 3 4��� 1 4�� �����ϰ�, -1 -2 -3 -4��� -4 -1�� �����ϸ� �˴ϴ�.

���� ����
s���� �� �̻��� ������ �������� ���еǾ� �ֽ��ϴ�.
*/
package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�������� ���е� ���ڵ��� �Է����ּ���: ");
			String s = scanner.nextLine();

			System.out.println(solution(s));
		}
	}

	private static String solution(String s) {
		String[] sArray = s.split(" ");
		int min, max, temp;
		min = max = Integer.parseInt(sArray[0]);
		for (int i = 1; i < sArray.length; ++i) {
			temp = Integer.parseInt(sArray[i]);
			if (min > temp)
				min = temp;
			if (max < temp)
				max = temp;
		}
		return min + " " + max;
	}
}
