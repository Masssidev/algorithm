/*
���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
s�� ���̴� 1 �̻� 10,000�����Դϴ�.
s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
s�� 0���� �������� �ʽ��ϴ�.
*/
package practice;

import java.util.Scanner;

public class ParseInt {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("���ڿ��� �Է����ּ���: ");
			String s = scanner.next();

			System.out.println(solution(s));
		}
	}
	
	private static int solution(String s){
		return Integer.parseInt(s);
	}

}
