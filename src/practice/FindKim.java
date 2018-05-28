/*
String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. 
seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

���� ����
seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
Kim�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindKim {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�迭�� ũ�⸦ �����ּ���: ");
			int size = scanner.nextInt();
			String[] arr = new String[size];
			System.out.print("�迭�� ������ �ܾ���� �Է����ּ���: ");
			for (int i = 0; i < size; ++i) {
				arr[i] = scanner.next();
			}
			System.out.println(solution(arr));
		}
	}

	private static String solution(String[] seoul) {
		int index = Arrays.asList(seoul).indexOf("Kim");
		return "�輭���� " + index + "�� �ִ�";

	}

}
