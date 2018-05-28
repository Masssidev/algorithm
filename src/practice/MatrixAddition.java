package practice;

import java.util.Arrays;
/*
문제 설명
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
*/
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("두 행렬의 크기를 입력해주세요: ");
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			
			int[][] matrix1 = new int[row][column];
			System.out.print("첫번째 행렬의 요소를 입력해주세요: ");
			for (int i = 0; i < matrix1.length; ++i) {
				for (int j = 0; j < matrix1[i].length; ++j) {
					matrix1[i][j] = scanner.nextInt();
				}
			}
			
			int[][] matrix2 = new int[row][column];
			System.out.print("두번째 행렬의 요소를 입력해주세요: ");
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
