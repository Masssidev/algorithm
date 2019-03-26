/*
 * 0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.
 * ���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.
 * 0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

import java.util.Arrays;

public class MaximumNumber {

	public static void main(String[] args) {
		MaximumNumber theMaximumNumber = new MaximumNumber();
		int[] numbers = { 3, 30, 34, 5, 9 };
		System.out.println(theMaximumNumber.solution(numbers));
	}

	public String solution(int[] numbers) {
		String[] arr = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++)
			arr[i] = String.valueOf(numbers[i]);

		Arrays.sort(arr, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));
		
		if (arr[0].equals("0"))
			return "0";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++)
			sb.append(arr[i]);

		return sb.toString();
	}
}
