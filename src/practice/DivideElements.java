/*array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

���ѻ���
arr�� �ڿ����� ���� �迭�Դϴ�.
���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
divisor�� �ڿ����Դϴ�.
array�� ���� 1 �̻��� �迭�Դϴ�.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class DivideElements {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�迭�� ũ�� �Է����ּ���: ");
			int size = scanner.nextInt();
			int[] arr = new int[size];
			System.out.print("�迭�� ��Ҹ� �Է����ּ���: ");
			for (int i = 0; i < arr.length; ++i) {
				arr[i] = scanner.nextInt();
			}
			System.out.println("divisor�� �Է����ּ���: ");
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
