/*
���� ����
2���� ��� arr1�� arr2�� �Է¹޾�, arr1�� arr2�� ���� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
��� arr1, arr2�� ��� ���� ���̴� 2 �̻� 100 �����Դϴ�.
��� arr1, arr2�� ���Ҵ� -10 �̻� 20 ������ �ڿ����Դϴ�.
���� �� �ִ� �迭�� �־����ϴ�.
*/

package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("ù��° ����� ũ�⸦ �Է����ּ���: ");
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			int[][] matrix1 = new int[row][column];
			System.out.print("ù��° ����� ��Ҹ� �Է����ּ���: ");
			for (int i = 0; i < matrix1.length; ++i) {
				for (int j = 0; j < matrix1[i].length; ++j) {
					matrix1[i][j] = scanner.nextInt();
				}
			}
			System.out.print("�ι�° ����� ũ�⸦ �Է����ּ���: ");
			row = scanner.nextInt();
			column = scanner.nextInt();
			int[][] matrix2 = new int[row][column];
			System.out.print("�ι�° ����� ��Ҹ� �Է����ּ���: ");
			for (int i = 0; i < matrix2.length; ++i) {
				for (int j = 0; j < matrix2[i].length; ++j) {
					matrix2[i][j] = scanner.nextInt();
				}
			}

			System.out.println(Arrays.deepToString((solution(matrix1, matrix2))));
		}
	}

	private static int[][] solution(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[matrix1.length][matrix2[0].length];
		for (int i = 0; i < result.length; ++i) {
			for (int j = 0; j < result[i].length; ++j) {
				for (int k = 0; k < matrix1[i].length; ++k) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return result;
	}
}
