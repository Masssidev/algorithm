/*
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
*/
package practice;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("배열의 크기 입력해주세요: ");
			int size = scanner.nextInt();
			int[] arr = new int[size];
			System.out.print("배열의 요소를 입력해주세요: ");
			for (int i = 0; i < arr.length; ++i) {
				arr[i] = scanner.nextInt();
			}
			
			System.out.println(solution(arr));
		}
	}
	
	private static double solution(int[] arr){
		double result = 0;
		for(int i=0; i<arr.length; ++i){
			result+=arr[i];
		}
		return result/arr.length;
	}

}
