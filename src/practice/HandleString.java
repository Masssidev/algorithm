/*문자열 s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수, solution을 완성하세요.
예를들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
*/
package practice;

import java.util.Scanner;

public class HandleString {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("문자열을 입력해주세요: ");
			String s = scanner.next();

			System.out.println(solution(s));
		}
	}

	private static boolean solution(String s) {
		int length = s.length();
		if (length != 4 && length != 6)
			return false;
		for (int i = 0; i < length; ++i) {
			char c = s.charAt(i);
			if (c < '0' || c > '9')
				return false;

		}
		return true;
	}

}
