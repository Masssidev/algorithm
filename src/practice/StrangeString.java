/*
 * ���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. 
 * �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 */
package practice;

public class StrangeString {

	public static void main(String[] args) {
		StrangeString theStrangeString = new StrangeString();
		String s = "    try        hello world            ";
		System.out.println(theStrangeString.solution(s));
	}

	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		int idx = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == ' ') {
				sb.append(" ");
				idx = 0;
				continue;
			}

			if (idx % 2 == 0) {
				sb.append(Character.toUpperCase(s.charAt(i)));
				idx++;
			}
			else {
				sb.append(Character.toLowerCase(s.charAt(i)));
				idx++;
			}
		}

		return sb.toString();
	}
}
