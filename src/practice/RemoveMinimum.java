/*
 문제 설명

정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
*/
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RemoveMinimum {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("배열의 크기 입력해주세요: ");
			int size = scanner.nextInt();
			int[] arr = new int[size];
			System.out.print("배열의 요소를 입력해주세요: ");
			for (int i = 0; i < arr.length; ++i) {
				arr[i] = scanner.nextInt();
			}

			System.out.println(Arrays.toString(solution(arr)));
		}
	}

	private static int[] solution(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		} else {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			for (int a : arr) {
				arrayList.add(a);
			}
			
			Integer minimum = Collections.min(arrayList);
			arrayList.remove(minimum);
			
			int[] resultArray = new int[arr.length - 1];
			for (int i = 0; i < arrayList.size(); ++i) {
				resultArray[i] = arrayList.get(i);
			}
			return resultArray;
		}
	}
}
