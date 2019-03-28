/*
 * String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. 
 * seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 */
package practice;

import java.util.Arrays;

public class WhereIsKim {

	public static void main(String[] args) {
		WhereIsKim theWhereIsKim = new WhereIsKim();
		String[] seoul = { "Jane", "Kim" };
		System.out.println(theWhereIsKim.solution(seoul));
	}

	public String solution(String[] seoul) {
		int idx = Arrays.asList(seoul).indexOf("Kim");
		String answer = "�輭����" + idx + "�� �ִ�.";
		return answer;
	}
}
