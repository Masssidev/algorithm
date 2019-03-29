/*
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */
package practice;

import java.util.Arrays;

public class NumberInvertion {

	public static void main(String[] args) {
		NumberInvertion theNumberInvertion = new NumberInvertion();
		int n = 12345;
		System.out.println(Arrays.toString(theNumberInvertion.solution(n)));
	}

	public int[] solution(long n) {
		int[] answer = new int[String.valueOf(n).length()];
		int idx = 0;
		while (n != 0) {
			answer[idx++] = (int)(n % 10);
			n /= 10;
		}
		return answer;
	}
}
