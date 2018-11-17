/*
 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. 
 * ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 */
package practice;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		int count = 0;

		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < count; ++i) {
			int people = scan.nextInt();
			double total = 0;
			double[] scores = new double[people];

			for (int j = 0; j < people; ++j) {
				scores[j] = scan.nextDouble();
				total += scores[j];
			}

			double average = total / scores.length;
			double aboveTheAverage = 0;

			for (int k = 0; k < scores.length; ++k) {
				if (scores[k] > average)
					aboveTheAverage++;
			}

			sb.append(String.format("%.3f", aboveTheAverage / scores.length * 100));
			sb.append("%\n");
		}
		scan.close();
		System.out.println(sb.toString());
	}

}
