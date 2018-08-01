/*
문제
2018년 코드 페스티벌이 성황리에 개최될 예정이다.

코드 페스티벌 참가자에게 환영의 인사를 전해주자!

입력
정수 N(1 ≤ N ≤ 10)이 입력된다.

출력
입력된 정수만큼 반복하여 Welcome to Kakao Code Festival!을 한 줄씩 출력한다.
*/
package practice;

import java.util.Scanner;

public class WelcomeToKakaoCodeFestival {

	public static void main(String[] args) {
		System.out.print("정수를 입력해 주세요: ");
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			solution(num);
		}
	}

	private static void solution(int num) {
		StringBuilder sb = new StringBuilder("Welcome to Kakao Code Festival!");
		for (int i = 0; i < num - 1; ++i) {
			sb.append("\nWelcome to Kakao Code Festival!");
		}
		System.out.println(sb.toString());
	}
}

