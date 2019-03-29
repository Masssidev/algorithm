/*
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 * s의 맨앞에는 부호(+, -)가 올 수 있습니다.
 */
package practice;

public class Conversion {

	public static void main(String[] args) {
		Conversion theConversion = new Conversion();
		String s = "+1234";
		System.out.println(theConversion.solution(s));
	}

	public int solution(String s) {
		if (s.charAt(0) == '-')
			return -Integer.parseInt(s.substring(1));
		else {
			if (s.charAt(0) == '+')
				return Integer.parseInt(s.substring(1));
			else
				return Integer.parseInt(s);
		}

	}
}
