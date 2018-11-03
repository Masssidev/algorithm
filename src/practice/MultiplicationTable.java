/*
 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package practice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int num = 0;
		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10; ++i) {
			sb.append(num);
			sb.append(" * ");
			sb.append(i);
			sb.append(" = ");
			sb.append(num * i);
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

}
