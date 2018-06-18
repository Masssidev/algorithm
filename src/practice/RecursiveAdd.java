/*
 * 문제설명
 * 정수 n이 주어졌을 때 0~n까지를 리스트에 재귀적으로 저장하라.
 */
package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveAdd {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("자연수를 입력해주세요: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static List<Integer> solution(int num) {
		plus(num);
		return arrayList;
	}

	private static List<Integer> arrayList = new ArrayList<>();

	private static void plus(int num) {
		if (0 > num)
			return;
		else {
			arrayList.add(num--);
			plus(num);
		}
	}
}
