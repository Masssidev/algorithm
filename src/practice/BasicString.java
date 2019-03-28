/*
 * ���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. 
 * ���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.
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
