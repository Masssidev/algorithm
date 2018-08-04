/*
īī�� �ڵ� �佺Ƽ������ ���� �� ���� ���� �ٷ� ����̴�. 
2017�⿡ ���ֵ� ��1ȸ �ڵ� �佺Ƽ��������, ���� ������ 100�� �� 21���� �Ʒ��� ���� �������� ����� �ο��Ͽ���.

����	���	�ο�
1��	500����	1��
2��	300����	2��
3��	200����	3��
4��	50����	4��
5��	30����	5��
6��	10����	6��
2018�⿡ ���ֵ� ��2ȸ �ڵ� �佺Ƽ�������� ����� �Ը� Ȯ��Ǿ�, ���� ������ 64�� �� 31���� �Ʒ��� ���� �������� ����� �ο��� �����̴�.

����	���	�ο�
1��	512����	1��
2��	256����	2��
3��	128����	4��
4��	64����	8��
5��	32����	16��

�������� �ڽ��� �ڵ� �佺Ƽ���� �����Ͽ� ���� �� ���� ����� ������ �ñ�������. 
�״� �ڽ��� �� ���� �ڵ� �佺Ƽ�� ���� ��ȸ���� ���� �� ���� �� ����� ������ �˾ƺ��� ����, ������ �����Ͽ� �Ʒ��� ���� ������ �Ͽ���.

��1ȸ �ڵ� �佺Ƽ�� ������ �����Ͽ� a��(1 �� a �� 100)���� �Ͽ���. 
��, �������� ���ߴٸ� a = 0���� �д�.

��2ȸ �ڵ� �佺Ƽ�� ������ �����Ͽ� b��(1 �� b �� 64)���� �� ���̴�. 
��, �������� ���ߴٸ� b = 0���� �д�.

�������� �̷��� ������ ����, �ڽ��� ���� �� �ִ� �� ����� �������� �˰� �;��Ѵ�.

�Է�
ù ��° �ٿ� �������� ������ �����Ͽ� ������ Ƚ�� T(1 �� T �� 1,000)�� �־�����.

���� T�� �ٿ��� �� �ٿ� �ϳ��� �������� �غ� ������ ���� ������ �־�����. 
�� �ٿ��� �� ���� ���� �ƴ� ���� a(0 �� a �� 100)�� b(0 �� b �� 64)�� ���� �ϳ��� ���̷� �ΰ� �־�����.

���
�� ������ ������ �� �������� ���� ����� �� ������ ������ �� �ٿ� �ϳ��� ����Ѵ�. 
�Է��� ������ ������� ����ؾ� �Ѵ�.
*/
package practice;

import java.util.Scanner;

public class PrizeMoneyHunter {

	public static void main(String[] args) {
		System.out.print("���� Ƚ���� �Է����ּ���: ");
		try (Scanner sc = new Scanner(System.in)) {
			int count = sc.nextInt();
			int[][] rank = new int[count][2];
			System.out.println("����� �Է����ּ���.");
			for (int i = 0; i < rank.length; ++i) {
				for (int j = 0; j < rank[0].length; ++j) {
					rank[i][j] = sc.nextInt();
				}
			}
			makeResultPrizeMoney(rank);
		}
	}

	private static void makeResultPrizeMoney(int[][] rank) {

		for (int i = 0; i < rank.length; ++i) {
			int resultPrizeMoney = 0;

			if (rank[i][0] > 0)
				resultPrizeMoney += getLastPrizeMoney(rank[i][0]);
			if (rank[i][1] > 0)
				resultPrizeMoney += getThisPrizeMoney(rank[i][1]);

			System.out.println(resultPrizeMoney * 10000);
		}
	}

	private static int getLastPrizeMoney(int lastRank) {
		int[][] lastPrizeMoney = { { 500, 1 }, { 300, 2 }, { 200, 3 }, { 50, 4 }, { 30, 5 }, { 10, 6 } };

		for (int i = 0; i < lastPrizeMoney.length; ++i) {
			lastRank -= lastPrizeMoney[i][1];
			if (lastRank <= 0)
				return lastPrizeMoney[i][0];
		}
		return 0;
	}

	private static int getThisPrizeMoney(int thisRank) {
		int[][] thisPrizeMoney = { { 512, 1 }, { 256, 2 }, { 128, 4 }, { 64, 8 }, { 32, 16 } };

		for (int i = 0; i < thisPrizeMoney.length; ++i) {
			thisRank -= thisPrizeMoney[i][1];
			if (thisRank <= 0)
				return thisPrizeMoney[i][0];
		}
		return 0;
	}
}
