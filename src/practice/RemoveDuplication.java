/*�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
 * �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
 * �迭 arr���� ���� �ǰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���. 
 * ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�.
�������
arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
*/
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplication {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�迭�� ũ�⸦ �����ּ���: ");
			int size = scanner.nextInt();
			int[] arr = new int[size];
			System.out.print("�迭�� ������ ���ڵ��� �Է����ּ���: ");
			for (int i = 0; i < size; ++i) {
				arr[i] = scanner.nextInt();
			}

			System.out.println(Arrays.toString(solution(arr)));
		}
	}

	private static int[] solution(int[] arr) {
		return makeIntArray(getArrayList(arr));
	}

	private static ArrayList<Integer> getArrayList(int[] arr) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(arr[0]);
		for (int i = 0; i < arr.length - 1; ++i) {
			if (arr[i] != arr[i + 1])
				arrayList.add(arr[i + 1]);
		}
		return arrayList;
	}

	private static int[] makeIntArray(ArrayList<Integer> arrayList) {
		int[] result = new int[arrayList.size()];
		for (int i = 0; i < result.length; ++i) {
			result[i] = arrayList.get(i);
		}
		return result;
	}

}
