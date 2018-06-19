/*
문제 설명
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 
예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

제한 사항
arr은 길이 1이상, 15이하인 배열입니다.
arr의 원소는 100 이하인 자연수입니다.
*/
package practice;

import java.util.Scanner;

public class LcmByN {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("행렬의 크기를 입력해주세요: ");
			int size = scanner.nextInt();
			int[] matrix = new int[size];
			System.out.print("행렬의 요소를 입력해주세요: ");
			for (int i = 0; i < matrix.length; ++i) {
				matrix[i] = scanner.nextInt();

			}

			System.out.println(solution(matrix));
		}
	}

	private static int solution(int[] matrix) {
		int result = matrix[0];
		for (int i = 1; i < matrix.length; ++i) {
			result = lcm(result, matrix[i]);
		}
		return result;
	}

	private static int lcm(int a, int b) {
		int temp1 = a;
		int temp2 = b;
		while (a != b) {
			if (a > b)
				a -= b;
			else
				b -= a;
		}
		return temp1 * temp2 / a;
	}
}
