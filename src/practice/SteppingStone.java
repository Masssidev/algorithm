/*
 * ����������� distance��ŭ ������ ���� ���������� �ֽ��ϴ�. �׸��� �׻��̿��� �������� �����ֽ��ϴ�. ���� �� �� ���� �����Ϸ��� �մϴ�.
 * ���� ���, ���������� 25��ŭ ������ �ְ�, ������ [2, 14, 11, 21, 17] ������ �������� �� ���� 2���� �����ϸ� �������, ��������, ���� ���� �Ÿ��� �Ʒ��� �����ϴ�.
 * ������ ������ ��ġ	�� ���� ������ �Ÿ�	�Ÿ��� �ּڰ�
 * [21, 17]	[2, 9, 3, 11]	       2
 * [2, 21]	[11, 3, 3, 8]	       3
 * [2, 11]	[14, 3, 4, 4]	       3
 * [11, 21]	[2, 12, 3, 8]	       2
 * [2, 14]	[11, 6, 4, 4]	       4
 * ������ ���� �Ÿ��� �ּڰ� �߿� ���� ū ���� 4�Դϴ�.
 * ����������� �������������� �Ÿ� distance, �������� �ִ� ��ġ�� ���� �迭 rocks, ������ ������ �� n�� �Ű������� �־��� ��, 
 * ������ n�� ������ �� �� ���� ������ �Ÿ��� �ּڰ� �߿� ���� ū ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

import java.util.Arrays;

public class SteppingStone {

	public static void main(String[] args) {
		SteppingStone theSteppingStone = new SteppingStone();
		int distance = 25;
		int[] rocks = { 2, 14, 11, 21, 17 };
		int n = 2;
		System.out.println(theSteppingStone.solution(distance, rocks, n));
	}

	public int solution(int distance, int[] rocks, int n) {
		int answer = 0;
		Arrays.sort(rocks);

		int start = 1, end = distance, middle;
		while (start <= end) {
			middle = (start + end) / 2;
			int cur = 0;
			int hits = 0;
			for (int i = 0; i < rocks.length; i++) {
				if (rocks[i] - cur < middle) {
					hits++;
				} else {
					cur = rocks[i];
				}
			}
			if (hits > n) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		answer = end;
		return answer;
	}

}
