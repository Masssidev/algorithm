/* 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
제한 조건
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
*/
package practice;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("해당 월을 입력해주세요: ");
			int month = scanner.nextInt();
			System.out.print("해당 일을 입력해주세요: ");
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
