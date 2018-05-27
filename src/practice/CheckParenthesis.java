/*올바른 괄호란 두 개의 괄호 '(' 와 ')' 만으로 구성되어 있고, 괄호가 올바르게 짝지어진 문자열입니다. 
 * 괄호가 올바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 합니다.
예를들어

()() 또는 (())() 는 올바른 괄호입니다.
)()( 또는 (()( 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고,
 올바르지 않은 괄호이면 false를 return하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
*/
package practice;

import java.util.Scanner;
import java.util.Stack;

public class CheckParenthesis {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("괄호를 입력해주세요: ");
			String parenthesis = scanner.next();

			System.out.println(solution(parenthesis));
		}
	}

	private static boolean solution(String parenthesis) {
		Stack<Character> parenthesisStack = new Stack<>();
		int parenthesisLength = parenthesis.length();
		char symbol;

		for (int i = 0; i < parenthesisLength; ++i) {
			symbol = parenthesis.charAt(i);
			switch (symbol) {
			case '(':
				parenthesisStack.push(symbol);
				break;
			case ')':
				if (parenthesisStack.isEmpty())
					return false;
				parenthesisStack.pop();
				break;
			}
		}

		return (parenthesisStack.isEmpty() ? true : false);
	}

}
