/*array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class DivideElements {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("배열의 크기 입력해주세요: ");
			int size = scanner.nextInt();
			int[] arr = new int[size];
			System.out.print("배열의 요소를 입력해주세요: ");
			for (int i = 0; i < arr.length; ++i) {
				arr[i] = scanner.nextInt();
			}
			System.out.println("divisor를 입력해주세요: ");
			int divisor = scanner.nextInt();
			System.out.println(Arrays.toString(solution(arr, divisor)));
		}
	}

	private static int[] solution(int[] arr, int divisor) {
		int[] result = Arrays.stream(arr).filter(a -> a % divisor == 0).sorted().toArray();
		if (result.length == 0)
			result = new int[] { -1 };
		return result;
	}

}
