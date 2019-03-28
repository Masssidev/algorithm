/*
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 */
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisionElement {

	public static void main(String[] args) {
		DivisionElement theDivisionElement = new DivisionElement();
		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
		System.out.println(Arrays.toString(theDivisionElement.solution(arr, divisor)));
	}

	public int[] solution(int[] arr, int divisor) {
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] % divisor == 0)
				arrayList.add(arr[i]);
		}

		if (arrayList.isEmpty())
			return new int[] { -1 };
		
		int[] answer = new int[arrayList.size()];
		int idx = 0;
		for (int value : arrayList) {
			answer[idx++] = value;
		}
		
		Arrays.sort(answer);
		return answer;
	}
}
