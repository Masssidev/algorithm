/*
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
 */
package practice;

import java.util.Scanner;

public class SearchMiddleWord {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("단어를 입력해주세요: ");
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
