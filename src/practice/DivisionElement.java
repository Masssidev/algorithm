/*
 * array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
 * divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
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
