/*
 * 1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 하고 있습니다. 영어 끝말잇기는 다음과 같은 규칙으로 진행됩니다.
 * 1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
 * 마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
 * 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
 * 이전에 등장했던 단어는 사용할 수 없습니다.
 * 한 글자인 단어는 인정되지 않습니다.
 * 사람의 수 n과 사람들이 순서대로 말한 단어 words 가 매개변수로 주어질 때, 
 * 가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서 return 하도록 solution 함수를 완성해주세요.
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
