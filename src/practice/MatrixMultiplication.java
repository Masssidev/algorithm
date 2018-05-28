/*
문제 설명
2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
곱할 수 있는 배열만 주어집니다.
*/

package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("첫번째 행렬의 크기를 입력해주세요: ");
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			int[][] matrix1 = new int[row][column];
			System.out.print("첫번째 행렬의 요소를 입력해주세요: ");
			for (int i = 0; i < matrix1.length; ++i) {
				for (int j = 0; j < matrix1[i].length; ++j) {
					matrix1[i][j] = scanner.nextInt();
				}
			}
			System.out.print("두번째 행렬의 크기를 입력해주세요: ");
			row = scanner.nextInt();
			column = scanner.nextInt();
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
