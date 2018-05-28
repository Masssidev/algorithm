/*
정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.

제한 조건
num은 int 범위의 정수입니다.
0은 짝수입니다.
*/
package practice;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("정수를 입력해주세요: ");
			int num = scanner.nextInt();

			System.out.println((solution(num)));
		}
	}

	private static String solution(int num){
		return (num%2 == 0 ? "Even" : "Odd");
	}
}
