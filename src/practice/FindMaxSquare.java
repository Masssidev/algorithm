/*
문제 설명
1와 0로 채워진 표(board)가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다. 
표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. 
(단, 정사각형이란 축에 평행한 정사각형을 말합니다.)
제한사항
표(board)는 2차원 배열로 주어집니다.
표(board)의 행(row)의 크기 : 1000 이하의 자연수
표(board)의 열(column)의 크기 : 1000 이하의 자연수
표(board)의 값은 1또는 0으로만 이루어져 있습니다.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxSquare {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("2차원 배열의 크기를 입력해주세요: ");
			int raw = scanner.nextInt();
			int column = scanner.nextInt();
			int[][] arr = new int[raw][column];
			System.out.print("배열의 요소를 입력해주세요: ");
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
