/*
 ���� ����

������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

���� ����
arr�� ���� 1 �̻��� �迭�Դϴ�.
�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
*/
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RemoveMinimum {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�迭�� ũ�� �Է����ּ���: ");
			int size = scanner.nextInt();
			int[] arr = new int[size];
			System.out.print("�迭�� ��Ҹ� �Է����ּ���: ");
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
