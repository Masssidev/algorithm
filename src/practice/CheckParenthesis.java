/*�ùٸ� ��ȣ�� �� ���� ��ȣ '(' �� ')' ������ �����Ǿ� �ְ�, ��ȣ�� �ùٸ��� ¦������ ���ڿ��Դϴ�. 
 * ��ȣ�� �ùٸ��� ¦�������ٴ� ���� '(' ���ڷ� �������� �ݵ�� ¦��� ')' ���ڷ� ������ �մϴ�.
�������

()() �Ǵ� (())() �� �ùٸ� ��ȣ�Դϴ�.
)()( �Ǵ� (()( �� �ùٸ��� ���� ��ȣ�Դϴ�.
'(' �Ǵ� ')' �θ� �̷���� ���ڿ� s�� �־����� ��, ���ڿ� s�� �ùٸ� ��ȣ�̸� true�� return �ϰ�,
 �ùٸ��� ���� ��ȣ�̸� false�� return�ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
���ڿ� s�� ���� : 100,000 ������ �ڿ���
���ڿ� s�� '(' �Ǵ� ')' �θ� �̷���� �ֽ��ϴ�.
*/
package practice;

import java.util.Scanner;
import java.util.Stack;

public class CheckParenthesis {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("��ȣ�� �Է����ּ���: ");
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
