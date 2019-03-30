/*
 * 1���� n���� ��ȣ�� �پ��ִ� n���� ����� ���� �����ձ⸦ �ϰ� �ֽ��ϴ�. ���� �����ձ�� ������ ���� ��Ģ���� ����˴ϴ�.
 * 1������ ��ȣ ������� �� ����� ���ʴ�� �ܾ ���մϴ�.
 * ������ ����� �ܾ ���� �������� �ٽ� 1������ �����մϴ�.
 * �ջ���� ���� �ܾ��� ������ ���ڷ� �����ϴ� �ܾ ���ؾ� �մϴ�.
 * ������ �����ߴ� �ܾ�� ����� �� �����ϴ�.
 * �� ������ �ܾ�� �������� �ʽ��ϴ�.
 * ����� �� n�� ������� ������� ���� �ܾ� words �� �Ű������� �־��� ��, 
 * ���� ���� Ż���ϴ� ����� ��ȣ�� �� ����� �ڽ��� �� ��° ���ʿ� Ż���ϴ����� ���ؼ� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 */
package practice;

import java.util.Arrays;
import java.util.Stack;

public class EnglishWordChain {

	public static void main(String[] args) {
		EnglishWordChain theEnglishWordChain = new EnglishWordChain();
		int n = 2;
		String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };
		System.out.println(Arrays.toString(theEnglishWordChain.solution(n, words)));
	}

	public int[] solution(int n, String[] words) {
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < n; ++i) {
			stack.push(words[i]);
		}

		for (int i = n; i < words.length; ++i) {
			if (stack.contains(words[i]) || words[i].charAt(0) != stack.peek().charAt(stack.peek().length() - 1)) {
				return new int [] {i%n+1, i/n+1};
			} else
				stack.push(words[i]);
		}

		return new int[] { 0, 0 };
	}
}
