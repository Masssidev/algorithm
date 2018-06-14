/*
���� ����
���������� ������ ���� n���� �̷���� ���� �ֽ��ϴ�. �̹��� �� ���󿡼��� n���� ���� �� �� ���ÿ� ������ ����� �Ͽ����ϴ�. ������ ������ ������ ������ ������ �����ϴ�.

�� ������ ��� ���ֹ��� ��� ������ ����Ѵٰ� ������, ��� ����� �̵� �Ÿ��� ���� �ּҰ� �Ǵ� ���ÿ� ������ �����ϴ�.
�̵� �Ÿ��� ���� �ּҰ� �Ǵ� ������ �������� ������ ��ġ�� �� ���� ���ÿ� ������ �����ϴ�.
���� �� 1�� ��ġ�� ���ÿ� 5���� �����, 2�� ��ġ�� ���ÿ� 2���� �����, 3�� ��ġ�� ���ÿ� 3���� ����� ��ٰ� �ϰڽ��ϴ�.
1�� ��ġ�� ���ÿ� ������ ���´ٸ� �� �̵� �Ÿ��� 5 * 0 + 2 * 1 + 3 * 2 = 8
2�� ��ġ�� ���ÿ� ������ ���´ٸ� �� �̵� �Ÿ��� 5 * 1 + 2 * 0 + 3 * 1 = 8
3�� ��ġ�� ���ÿ� ������ ���´ٸ� �� �̵� �Ÿ��� 5 * 2 + 2 * 1 + 3 * 0 = 12
���� �� ���� 1�� ��ġ�� ������ ���� �˴ϴ�.

������ ��ġ�� �� ���ÿ� ��� ����� �� cities�� �Ű������� �־��� ��, ������ ���� ������ ��ġ�� return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
������ ��ġ�� -100,000 �̻� 100,000������ ���� �Դϴ�.
cities�� �����ϴ� ������ ù��° ���� ������ ��ġ��, �ι�° ���� ���ÿ� ��� ��� ���� �ǹ� �մϴ�.
�� ������ ���ô� 10,000�� �����Դϴ�.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class AirportBuild {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("2���� �迭�� ũ�⸦ �Է����ּ���: ");
			int raw = scanner.nextInt();
			int column = scanner.nextInt();
			int[][] arr = new int[raw][column];
			System.out.print("�迭�� ��Ҹ� �Է����ּ���: ");
			for (int i = 0; i < arr.length; ++i) {
				for (int j = 0; j < arr[0].length; ++j) {
					arr[i][j] = scanner.nextInt();
				}
			}

			System.out.println(solution(arr));
		}
		
	}

	private static int solution(int[][] arr) {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; ++i) {
			int sum = 0;
			int temp = arr[i][0];
			for (int j = 0; j < arr.length; ++j) {
				sum += arr[j][1] * Math.abs(arr[j][0] - temp);
			}
			result[i] = sum;
		}

		int min = Integer.MAX_VALUE;
		for (int k = 0; k < arr.length; ++k) {
			if (result[k] < min)
				min = k + 1;
		}

		return min;
	}
}
