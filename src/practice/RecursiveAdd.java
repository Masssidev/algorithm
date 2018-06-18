/*
 * ��������
 * ���� n�� �־����� �� 0~n������ ����Ʈ�� ��������� �����϶�.
 */
package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveAdd {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�ڿ����� �Է����ּ���: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static List<Integer> solution(int num) {
		plus(num);
		return arrayList;
	}

	private static List<Integer> arrayList = new ArrayList<>();

	private static void plus(int num) {
		if (0 > num)
			return;
		else {
			arrayList.add(num--);
			plus(num);
		}
	}
}
