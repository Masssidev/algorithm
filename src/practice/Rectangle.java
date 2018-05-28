/*
문제 설명
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

제한 조건
n과 m은 각각 1000 이하인 자연수입니다.
*/
package practice;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("사각형의 가로, 세로를 입력해주세요: ");
			int width = scanner.nextInt();
			int height = scanner.nextInt();

			solution(width, height);
		}
	}

	private static void solution(int width, int height) {
		for (int i = 0; i < height; ++i) {
			for (int j = 0; j < width; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
