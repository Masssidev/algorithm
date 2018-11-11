/*
 * ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����. 
 * �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package practice;

import java.util.Scanner;

public class TenOfCharacters {

	public static void main(String[] args) {
		String word = null;

		try (Scanner scan = new Scanner(System.in)) {
			word = scan.next();
		}

		StringBuilder sb = new StringBuilder();
		int length = word.length();
		int startIndex=0;
		
		for (int i = 0; i < length / 10; ++i) {
			sb.append(word.substring(startIndex, startIndex+=10));
			sb.append("\n");
		}
		sb.append(word.substring(length / 10 * 10));

		System.out.println(sb.toString());
	}

}
