/*
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

제한 조건
s의 길이는 1 이상 10,000이하입니다.
s의 맨앞에는 부호(+, -)가 올 수 있습니다.
s는 부호와 숫자로만 이루어져있습니다.
s는 0으로 시작하지 않습니다.
*/
package practice;

import java.util.Scanner;

public class ParseInt {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("문자열을 입력해주세요: ");
			String s = scanner.next();

			System.out.println(solution(s));
		}
	}
	
	private static int solution(String s){
		return Integer.parseInt(s);
	}

}
