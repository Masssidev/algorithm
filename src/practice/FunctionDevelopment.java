/*
 * ���α׷��ӽ� �������� ��� ���� �۾��� ���� ���Դϴ�. �� ����� ������ 100%�� �� ���񽺿� �ݿ��� �� �ֽ��ϴ�.
 * ��, �� ����� ���߼ӵ��� ��� �ٸ��� ������ �ڿ� �ִ� ����� �տ� �ִ� ��ɺ��� ���� ���ߵ� �� �ְ�, �̶� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����˴ϴ�.
 * ���� �����Ǿ�� �ϴ� ������� �۾��� ������ ���� ���� �迭 progresses�� �� �۾��� ���� �ӵ��� ���� ���� �迭 speeds�� �־��� ��
 * �� �������� �� ���� ����� �����Ǵ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
 */
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelopment {

	public static void main(String[] args) {
		FunctionDevelopment theFunctionDevelopment = new FunctionDevelopment();
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };
		System.out.println(Arrays.toString(theFunctionDevelopment.solution(progresses, speeds)));
	}

	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> done = new LinkedList<>();
		for (int i = 0; i < progresses.length; ++i) {
			done.add((100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i]
					: (100 - progresses[i]) / speeds[i] + 1);
		}

		int count = 1;
		List<Integer> countList = new ArrayList<>();
		int standard = done.poll();
		while (!done.isEmpty()) {
			int num = done.poll();
			if (standard >= num) {
				count++;
			} else {
				countList.add(count);
				count = 1;
				standard = num;
			}
		}
		countList.add(count);
		int[] answer = new int[countList.size()];
		int idx = 0;
		for (int value : countList){
			answer[idx++] = value;
		}
		return answer;
	}
}
