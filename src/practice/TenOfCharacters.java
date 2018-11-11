/*
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다. 
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
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
