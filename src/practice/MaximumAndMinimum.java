/*
���� ����
���ڿ� s���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�. str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� �̸� (�ּҰ�) (�ִ밪)������ ���ڿ��� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
������� s�� 1 2 3 4��� 1 4�� �����ϰ�, -1 -2 -3 -4��� -4 -1�� �����ϸ� �˴ϴ�.

���� ����
s���� �� �̻��� ������ �������� ���еǾ� �ֽ��ϴ�.
*/
package practice;

import java.util.Arrays;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		MaximumAndMinimum theMaximumAndMinimum = new MaximumAndMinimum();
		String s = "-1 -2 -3 -4";
		System.out.println(theMaximumAndMinimum.solution(s));
	}

	public String solution(String s) {
		String[] arr = s.split(" ");

		int[] intArray = new int[arr.length];
		int idx = 0;
		for(String value: arr) {
			intArray[idx++] = Integer.parseInt(value);
		}
		Arrays.sort(intArray);
		return intArray[0] + " " + intArray[intArray.length - 1];
	}
}
