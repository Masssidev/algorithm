/*
 * �Է��� �־�����. 
 * �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. 
 * �� ���� 100���ڸ� ���� ������, �� ���� �־��� ���� �ְ�, �� ���� �� �ڿ� ������ ���� ���� �ִ�.
 * �Է¹��� �״�� ����϶�.
 */
package practice;

import java.util.Scanner;

public class MessagesPrint {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		try (Scanner scan = new Scanner(System.in)) {
			while (scan.hasNextLine()) {
				String sentence = scan.nextLine();

				sb.append(sentence);
				sb.append("\n");
			}
		}

		System.out.println(sb.toString());
	}
}
