/*
���� ����
�ڿ��� n ���� �̷���� ���� �߿� ���� �� ������ �����ϴ� ������ �ְ��� �����̶�� �մϴ�.

�� ������ ���� S�� �Ǵ� ���� ����
�� ������ �����ϸ鼭 �� ������ �� �� �ִ밡 �Ǵ� ����
���� �� �ڿ��� 2���� �̷���� ���� �� ���� 9�� �Ǵ� ������ ������ ���� 4���� �ֽ��ϴ�.
{ 1, 8 }, { 2, 7 }, { 3, 6 }, { 4, 5 }
���� �� ������ ���� �ִ��� { 4, 5 }�� �ְ��� �����Դϴ�.

������ ������ ���� n�� ��� ���ҵ��� �� s�� �Ű������� �־��� ��, �ְ��� ������ return �ϴ� solution �Լ��� �ϼ����ּ���.

���ѻ���
�ְ��� ������ ������������ ���ĵ� 1���� �迭(list, vector) �� return ���ּ���.
���� �ְ��� ������ �������� �ʴ� ��쿡 ũ�Ⱑ 1�� 1���� �迭(list, vector) �� -1 �� ä���� return ���ּ���.
�ڿ����� ���� n�� 1 �̻� 10,000 ������ �ڿ����Դϴ�.
��� ���ҵ��� �� s�� 1 �̻�, 100,000,000 ������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SetOfTheBest {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("������ ������ �Է����ּ���: ");
			int num = scanner.nextInt();
			System.out.print("���ҵ��� ���� �Է����ּ���: ");
			int sum = scanner.nextInt();

			System.out.println(Arrays.toString(solution(num, sum)));
		}
	}

	private static int[] solution(int num, int sum) {
		if (num > sum)
			return new int[] { -1 };
		else {
			int[] result = new int[num];
			int total = sum;
			for (int i = 0; i < result.length; ++i) {
				result[i] = (total / (result.length - i));
				total = total - (total / (result.length - i));
			}
			return result;
		}
	}
}
