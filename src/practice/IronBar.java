/*
 * ���� ���� �踷��⸦ �������� �����Ϸ��� �մϴ�. ȿ������ �۾��� ���ؼ� �踷��⸦ �Ʒ����� ���� ���� ����, �������� ������ �������� �߻��Ͽ� �踷������ �ڸ��ϴ�. 
 * �踷���� �������� ��ġ�� ���� ������ �����մϴ�.
 * - �踷���� �ڽź��� �� �踷��� ������ ���� �� �ֽ��ϴ�.
 * - �踷��⸦ �ٸ� �踷��� ���� ���� ��� ������ ���Եǵ��� ����, ������ ��ġ�� �ʵ��� �����ϴ�.
 * - �� �踷��⸦ �ڸ��� �������� ��� �ϳ� �����մϴ�.
 * - �������� � �踷����� �� �������� ��ġ�� �ʽ��ϴ�.
 * �������� �踷����� ��ġ�� ������ ���� ��ȣ�� �̿��Ͽ� ���ʺ��� ������� ǥ���� �� �ֽ��ϴ�.
 * (a) �������� ���� ��ȣ�� �ݴ� ��ȣ�� ������ �� '()'���� ǥ���մϴ�. ���� ��� '()'�� �ݵ�� �������� ǥ���մϴ�.
 * (b) �踷����� ���� ���� ���� ��ȣ '('��, ������ ���� ���� ��ȣ ')'�� ǥ���˴ϴ�.
 * �踷���� �������� ��ġ�� ǥ���� ���ڿ� arrangement�� �Ű������� �־��� ��, �߸� �踷��� ������ �� ������ return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

import java.util.Stack;

public class IronBar {

	public static void main(String[] args) {
		IronBar theIronBar = new IronBar();
		String arrangement = "()(((()())(())()))(())";
		System.out.println(theIronBar.solution(arrangement));
	}

	public int solution(String arrangement) {
		Stack<Character> stack = new Stack<>();
		int answer = 0;

		for (int i = 0; i < arrangement.length(); ++i) {
			if (arrangement.charAt(i) == '(')
				stack.push(arrangement.charAt(i));
			else {
				stack.pop();
				if (arrangement.charAt(i - 1) == '(')
					answer += stack.size();
				else
					answer += 1;
			}
		}
		return answer;
	}
}
