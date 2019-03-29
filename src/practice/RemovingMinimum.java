/*
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
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
