/*
���� ����
�� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.

���� ����
n�� m�� ���� 1000 ������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�簢���� ����, ���θ� �Է����ּ���: ");
			int width = scanner.nextInt();
			int height = scanner.nextInt();

			solution(width, height);
		}
	}

	private static void solution(int width, int height) {
		for (int i = 0; i < height; ++i) {
			for (int j = 0; j < width; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
