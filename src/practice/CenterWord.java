/*
 * �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
 */
package practice;

public class CenterWord {

	public static void main(String[] args) {
		CenterWord theCenterWord = new CenterWord();
		String s = "aba";
		System.out.println(theCenterWord.solution(s));
	}

	public String solution(String s) {
		int length = s.length();
		int center = (length % 2 == 0 ? (length / 2) - 1 : (length / 2));
		String answer = length % 2 == 0 ? s.substring(center, center + 2) : s.substring(center, center + 1);
		return answer;
	}

}
