/*
 * H-Index�� �������� ���꼺�� ������� ��Ÿ���� ��ǥ�Դϴ�. ��� �������� H-Index�� ��Ÿ���� ���� h�� ���Ϸ��� �մϴ�. ��Ű���1�� ������, H-Index�� ������ ���� ���մϴ�.
 * � �����ڰ� ��ǥ�� �� n�� ��, h�� �̻� �ο�� ���� h�� �̻��̰� ������ ���� h�� ���� �ο�Ǿ��ٸ� h�� �� �������� H-Index�Դϴ�.
 * � �����ڰ� ��ǥ�� ���� �ο� Ƚ���� ���� �迭 citations�� �Ű������� �־��� ��, �� �������� H-Index�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		HIndex theHIndex = new HIndex();
		int[] citations = { 3, 0, 6, 1, 5 };
		System.out.println(theHIndex.solution(citations));
	}

	public int solution(int[] citations) {
		Arrays.sort(citations);

		int max = 0;
		for (int i = citations.length - 1; i > -1; i--) {
			int min = (int) Math.min(citations[i], citations.length - i);
			if (max < min)
				max = min;
		}

		return max;
	}
}
