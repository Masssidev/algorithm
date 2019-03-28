/*
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
 * 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
 */
package practice;

import java.util.regex.Pattern;

public class BasicString {

	public static void main(String[] args) {
		BasicString theBasicString = new BasicString();
		String s = "a1234";
		System.out.println(theBasicString.solution(s));
	}

	public boolean solution(String s) {
		return (s.length() == 4 || s.length() == 6) && Pattern.matches("^[0-9]*$", s);
	}
}
