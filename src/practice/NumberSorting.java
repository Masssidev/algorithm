/*
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
package practice;

import java.util.Arrays;
import java.util.Collections;

public class NumberSorting {

	public static void main(String[] args) {
		NumberSorting theNumberSorting = new NumberSorting();
		long n = 118372;
		System.out.println(theNumberSorting.solution(n));
	}

	public long solution(long n) {
		String[] arr = String.valueOf(n).split("");
		
		Arrays.sort(arr, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for (String value : arr) {
			sb.append(value);
		}

		long answer = Long.valueOf(sb.toString());
		return answer;
	}
}
