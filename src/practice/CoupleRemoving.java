/*
 * ¦���� �����ϱ��, ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��� ������ �����մϴ�. ���� ���ڿ����� ���� ���ĺ��� 2�� �پ� �ִ� ¦�� ã���ϴ�. 
 * �״���, �� ���� ������ ��, �յڷ� ���ڿ��� �̾� ���Դϴ�. �� ������ �ݺ��ؼ� ���ڿ��� ��� �����Ѵٸ� ¦���� �����ϱⰡ ����˴ϴ�. 
 * ���ڿ� S�� �־����� ��, ¦���� �����ϱ⸦ ���������� ������ �� �ִ��� ��ȯ�ϴ� �Լ��� �ϼ��� �ּ���. 
 * ���������� ������ �� ������ 1��, �ƴ� ��� 0�� �������ָ� �˴ϴ�.
 * ���� ���, ���ڿ� S = baabaa ���
 * b aa baa �� bb aa �� aa ��
 * �� ������ ���ڿ��� ��� ������ �� �����Ƿ� 1�� ��ȯ�մϴ�.
 */
package practice;

import java.util.Stack;

public class CoupleRemoving {

	public static void main(String[] args) {
		CoupleRemoving theCoupleRemoving = new CoupleRemoving();
		String s = "baabaa";
		System.out.println(theCoupleRemoving.solution(s));
	}

	public int solution(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); ++i) {
			if (stack.isEmpty() || s.charAt(i) != stack.peek())
				stack.push(s.charAt(i));
			else
				stack.pop();
		}

		return stack.isEmpty() ? 1 : 0;
	}
}
