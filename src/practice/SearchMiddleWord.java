/*
 * �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. 
 * �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
���ѻ���
s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
 */
package practice;

import java.util.Scanner;

public class SearchMiddleWord {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�ܾ �Է����ּ���: ");
			String word = scanner.next();
			System.out.println(solution(word));
		}
	}

	public static String solution(String word) {
		int wordLength = word.length();
		int middleIndex = wordLength/2;
		if(oddOrEven(wordLength) == 0)
			return word.substring(middleIndex-1, middleIndex+1);
		else
			return String.valueOf(word.charAt(middleIndex));
	}

	public static int oddOrEven(int wordLength) {
		return wordLength % 2;
	}
}
