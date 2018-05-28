package practice;

import java.util.Arrays;
/*
���� ����
����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�. 2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
��� arr1, arr2�� ��� ���� ���̴� 500�� ���� �ʽ��ϴ�.
*/
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�� ����� ũ�⸦ �Է����ּ���: ");
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			
			int[][] matrix1 = new int[row][column];
			System.out.print("ù��° ����� ��Ҹ� �Է����ּ���: ");
			for (int i = 0; i < matrix1.length; ++i) {
				for (int j = 0; j < matrix1[i].length; ++j) {
					matrix1[i][j] = scanner.nextInt();
				}
			}
			
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
		for (int i = 0; i < matrix1.length; ++i) {
			for (int j = 0; j < matrix1[0].length; ++j) {
				matrix1[i][j] += matrix2[i][j];
			}
		}
		return matrix1;
	}
}
