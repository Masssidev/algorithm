/*
문제 설명
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값) (최대값)형태의 문자열을 반환하는 함수, solution을 완성하세요.
예를들어 s가 1 2 3 4라면 1 4를 리턴하고, -1 -2 -3 -4라면 -4 -1을 리턴하면 됩니다.

제한 조건
s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
*/
package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("공백으로 구분된 숫자들을 입력해주세요: ");
			String s = scanner.nextLine();

			System.out.println(solution(s));
		}
	}

	private static String solution(String s) {
		String[] sArray = s.split(" ");
		int min, max, temp;
		min = max = Integer.parseInt(sArray[0]);
		for (int i = 1; i < sArray.length; ++i) {
			temp = Integer.parseInt(sArray[i]);
			if (min > temp)
				min = temp;
			if (max < temp)
				max = temp;
		}
		return min + " " + max;
	}
}
