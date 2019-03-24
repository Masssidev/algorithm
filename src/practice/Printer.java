/*
 * �Ϲ����� �����ʹ� �μ� ��û�� ���� ������� �μ��մϴ�. �׷��� ������ �߿��� ������ ���߿� �μ�� �� �ֽ��ϴ�. 
 * �̷� ������ �����ϱ� ���� �߿䵵�� ���� ������ ���� �μ��ϴ� �����͸� �����߽��ϴ�. �� ���Ӱ� ������ �����ʹ� �Ʒ��� ���� ������� �μ� �۾��� �����մϴ�.
 * 1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
 * 2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
 * 3. �׷��� ������ J�� �μ��մϴ�.
 * ���� ���, 4���� ����(A, B, C, D)�� ������� �μ� ����Ͽ� �ְ� �߿䵵�� 2 1 3 2 ��� C D A B ������ �μ��ϰ� �˴ϴ�.
 * ���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� �˰� �ͽ��ϴ�. ���� ������ C�� 1��°��, A�� 3��°�� �μ�˴ϴ�.
 * ���� ����Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭 priorities�� ���� �μ⸦ ��û�� ������ ���� ������� � ��ġ�� �ִ����� �˷��ִ� location�� �Ű������� �־��� ��,
 * ���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		Printer thePrinter = new Printer();
		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 0;
		System.out.println(thePrinter.solution(priorities, location));
	}

	public int solution(int[] priorities, int location) {
		int answer = 0;
		int l = location;

		Queue<Integer> que = new LinkedList<Integer>();
		for (int i : priorities) {
			que.add(i);
		}

		Arrays.sort(priorities);
		int size = priorities.length - 1;

		while (!que.isEmpty()) {
			Integer i = que.poll();
			if (i == priorities[size - answer]) {
				answer++;
				l--;
				if (l < 0)
					break;
			} else {
				que.add(i);
				l--;
				if (l < 0)
					l = que.size() - 1;
			}
		}

		return answer;
	}

}
