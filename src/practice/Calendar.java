/*
 * ������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�?
 * ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
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
