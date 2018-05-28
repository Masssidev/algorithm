/*
���� ����
���̰� ���� �迭 A, B �ΰ��� �ֽ��ϴ�. �� �迭�� �ڿ����� �̷���� �ֽ��ϴ�. 
�迭 A, B���� ���� �� ���� ���ڸ� �̾� �� ���� ���մϴ�. �̷��� ������ �迭�� ���̸�ŭ �ݺ��ϸ�, �� ���� ���� ���� �����Ͽ� ���մϴ�. �̶� ���������� ������ ���� �ּҰ� �ǵ��� ����� ���� ��ǥ�Դϴ�. (��, �� �迭���� k��° ���ڸ� �̾Ҵٸ� ������ k��° ���ڴ� �ٽ� ���� �� �����ϴ�.)

���� ��� A = [1, 4, 2] , B = [5, 4, 4] ���

A���� ù��° ������ 1, B���� �ι�° ������ 5�� �̾� ���Ͽ� ���մϴ�. (������ �� : 0 + 5(1x5) = 5)
A���� �ι�° ������ 4, B���� ����° ������ 4�� �̾� ���Ͽ� ���մϴ�. (������ �� : 5 + 16(4x4) = 21)
A���� ����° ������ 2, B���� ù��° ������ 4�� �̾� ���Ͽ� ���մϴ�. (������ �� : 21 + 8(2x4) = 29)
��, �� ��찡 �ּҰ� �ǹǷ� 29�� return �մϴ�.

�迭 A, B�� �־��� �� ���������� ������ �ּڰ��� return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
�迭 A, B�� ũ�� : 1000 ������ �ڿ���
�迭 A, B�� ������ ũ�� : 1000 ������ �ڿ���
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�迭�� ũ�⸦ �����ּ���: ");
			int size = scanner.nextInt();

			int[] arr1 = new int[size];
			System.out.print("ù ��° �迭�� ������ ���ڵ��� �Է����ּ���: ");
			for (int i = 0; i < size; ++i) {
				arr1[i] = scanner.nextInt();
			}

			int[] arr2 = new int[size];
			System.out.print("�� ��° �迭�� ������ ���ڵ��� �Է����ּ���: ");
			for (int i = 0; i < size; ++i) {
				arr2[i] = scanner.nextInt();
			}
			System.out.println(solution(arr1, arr2));
		}
	}

	private static int solution(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int result = 0;
		for (int i = 0; i < arr1.length; ++i) {
			result += arr1[i] * arr2[arr2.length - (1 + i)];
		}
		return result;
	}

}
