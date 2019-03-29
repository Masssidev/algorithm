/*
 * �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
 * ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
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
