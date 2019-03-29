/*
 * ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
 * ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
 */
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingMinimum {

	public static void main(String[] args) {
		RemovingMinimum theRemovingMinimum = new RemovingMinimum();
		int[] arr = { 4, 3, 2, 1 };
		System.out.println(Arrays.toString(theRemovingMinimum.solution(arr)));
	}

	public int[] solution(int[] arr) {
		if(arr.length == 1)
			return new int[] {-1};
		List<Integer> arrayList = new ArrayList<Integer>();
		for(int value : arr) {
			arrayList.add(value);
		}
		Arrays.sort(arr);
		arrayList.remove((Integer)arr[0]);
		int[] answer = new int[arrayList.size()];
		int idx = 0;
		for(int value : arrayList)
			answer[idx++] = value;
		return answer;
	}
}
