/*
 * 입력이 주어진다. 
 * 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
 * 각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
 * 입력받은 그대로 출력하라.
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
