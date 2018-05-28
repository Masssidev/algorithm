/*
������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.

���ѻ���
arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
*/
package practice;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�迭�� ũ�� �Է����ּ���: ");
			int size = scanner.nextInt();
			int[] arr = new int[size];
			System.out.print("�迭�� ��Ҹ� �Է����ּ���: ");
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
