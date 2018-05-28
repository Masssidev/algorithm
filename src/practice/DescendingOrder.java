package practice;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("정수를 입력해주세요: ");
			long num = scanner.nextLong();

			System.out.println(solution(num));
		}
	}

	private static long solution(long num) {
		char[] cArray = String.valueOf(num).toCharArray();
		Arrays.sort(cArray);
		StringBuilder sb = new StringBuilder(new String(cArray, 0, cArray.length));
		return Long.parseLong(sb.reverse().toString());
	}

}
