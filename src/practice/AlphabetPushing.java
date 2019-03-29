/*
 * � ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
 * ���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. 
 * ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
 */
package practice;

public class AlphabetPushing {

	public static void main(String[] args) {
		AlphabetPushing theAlphabetPushing = new AlphabetPushing();
		String s = "a B z";
		int n = 4;
		System.out.println(theAlphabetPushing.solution(s, n));
	}

	public String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (c == ' ')
				sb.append(c);
			else if (Character.isLowerCase(c)) {
				sb.append((char) ((c - 'a' + n) % 26 + 'a'));
			} else
				sb.append((char) ((c - 'A' + n) % 26 + 'A'));
		}
		return sb.toString();
	}
}
