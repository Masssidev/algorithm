/*
String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. 
seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

제한 사항
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
Kim은 반드시 seoul 안에 포함되어 있습니다.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindKim {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("배열의 크기를 정해주세요: ");
			int size = scanner.nextInt();
			String[] arr = new String[size];
			System.out.print("배열에 저장할 단어들을 입력해주세요: ");
			for (int i = 0; i < size; ++i) {
				arr[i] = scanner.next();
			}
			System.out.println(solution(arr));
		}
	}

	private static String solution(String[] seoul) {
		int index = Arrays.asList(seoul).indexOf("Kim");
		return "김서방은 " + index + "에 있다";

	}

}
