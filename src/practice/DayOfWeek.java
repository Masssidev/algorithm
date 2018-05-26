/* 2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? 
 * �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
 * ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�. 
 * ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
���� ����
2016���� �����Դϴ�.
2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
*/
package practice;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�ش� ���� �Է����ּ���: ");
			int month = scanner.nextInt();
			System.out.print("�ش� ���� �Է����ּ���: ");
			int day = scanner.nextInt();
			System.out.println(solution(month, day));
		}
	}

	public static String solution(int month, int day) {
		int[] dayPerMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int resultDay = 0;
		String answer = "";

		for (int i = 1; i < month; ++i) {
			resultDay += dayPerMonth[i - 1];
		}
		resultDay += day;

		switch (resultDay % 7) {
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		case 0:
			answer = "THU";
			break;
		}
		return answer;
	}
}
