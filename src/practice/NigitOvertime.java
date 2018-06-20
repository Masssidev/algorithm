/*
���� ����
ȸ��� Demi�� ������ �߱��� �ϴµ���, �߱��� �ϸ� �߱� �Ƿε��� ���Դϴ�. 
�߱� �Ƿε��� �߱��� ������ �������� ���� ���� �۾����� �����Ͽ� ���� ���Դϴ�. 
Demi�� N�ð� ���� �߱� �Ƿε��� �ּ�ȭ�ϵ��� ���� �̴ϴ�.
Demi�� 1�ð� ���� �۾��� 1��ŭ�� ó���� �� �ִٰ� �� ��, ��ٱ��� ���� N �ð��� 
�� �Ͽ� ���� �۾��� works�� ���� �߱� �Ƿε��� �ּ�ȭ�� ���� �����ϴ� �Լ� solution�� �ϼ����ּ���.

���� ����
works�� ���� 1 �̻�, 20,000 ������ �迭�Դϴ�.
works�� ���Ҵ� 50000 ������ �ڿ����Դϴ�.
n�� 1,000,000 ������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class NigitOvertime {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�迭�� ũ�⸦ �����ּ���: ");
			int size = scanner.nextInt();

			int[] arr = new int[size];
			System.out.print("�迭�� ������ ���ڵ��� �Է����ּ���: ");
			for (int i = 0; i < size; ++i) {
				arr[i] = scanner.nextInt();
			}

			System.out.print("��ٱ��� ���� �ð��� �Է����ּ���: ");
			int time = scanner.nextInt();
			System.out.println(solution(arr, time));
		}
	}

	private static int solution(int[] arr, int time) {
		for (int i = 0; i < time; ++i) {
			Arrays.sort(arr);
			if (arr[arr.length - 1] == 0)
				return 0;
			else {
				arr[arr.length - 1]--;
			}
		}
		int result = 0;
		for (int i = 0; i < arr.length; ++i) {
			result += Math.pow(arr[i], 2);
		}
		return result;
	}
}
