/*
���� ����
1�� 0�� ä���� ǥ(board)�� �ֽ��ϴ�. ǥ 1ĭ�� 1 x 1 �� ���簢������ �̷���� �ֽ��ϴ�. 
ǥ���� 1�� �̷���� ���� ū ���簢���� ã�� ���̸� return �ϴ� solution �Լ��� �ϼ��� �ּ���. 
(��, ���簢���̶� �࿡ ������ ���簢���� ���մϴ�.)
���ѻ���
ǥ(board)�� 2���� �迭�� �־����ϴ�.
ǥ(board)�� ��(row)�� ũ�� : 1000 ������ �ڿ���
ǥ(board)�� ��(column)�� ũ�� : 1000 ������ �ڿ���
ǥ(board)�� ���� 1�Ǵ� 0���θ� �̷���� �ֽ��ϴ�.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxSquare {

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
		int max = 0;
		for (int i = 1; i < arr.length; ++i) {
			for (int j = 1; j < arr[0].length; ++j) {
				if (arr[i][j] == 1) {
					arr[i][j] = Math.min(Math.min(arr[i - 1][j - 1], arr[i - 1][j]), arr[i][j - 1]) + 1;
					if (max < arr[i][j])
						max = arr[i][j];
				}
			}
		}
		return max * max;
	}
}
