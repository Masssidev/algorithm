/*
 * ���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
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
