/*
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까?
 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 */
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Calendar {

	private static final Integer[] THIRTYONEDAYS = { 1, 3, 5, 7, 8, 10, 12 };
	private static final Integer[] THIRTYDAYS = { 4, 6, 9, 11 };
	private static final String[] DAYS = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	public static void main(String[] args) {
		int month;
		int day = 0;

		try (Scanner scan = new Scanner(System.in)) {
			month = scan.nextInt();
			day = scan.nextInt();
		}

		int totalDays = day;
		for (int i = month - 1; i > 0; --i) {
			if (Arrays.asList(THIRTYONEDAYS).contains(i)) {
				totalDays += 31;
			} else if (Arrays.asList(THIRTYDAYS).contains(i)) {
				totalDays += 30;
			} else {
				totalDays += 28;
			}
			month--;
		}

		System.out.println(DAYS[totalDays % 7]);
	}

}
