/*
 * �ϵ��ũ�� �� ���� �ϳ��� �۾��� ������ �� �ֽ��ϴ�. ��ũ ��Ʈ�ѷ��� �����ϴ� ����� ���� ������ �ֽ��ϴ�. ���� �Ϲ����� ����� ��û�� ���� ������� ó���ϴ� ���Դϴ�.
 * �� ���� �ϳ��� ��û���� ������ �� �ֱ� ������ ������ �۾��� ��û���� ������� ó���ϸ� ������ ���� ó�� �˴ϴ�.
 * �� �� �� �۾��� ��û���� ������� �ɸ� �ð��� ����� 10ms(= (3 + 11 + 16) / 3)�� �˴ϴ�.
 * ������ A �� C �� B ������� ó���ϸ� �̷��� A �� C �� B�� ������ ó���ϸ� �� �۾��� ��û���� ������� �ɸ� �ð��� ����� 9ms(= (3 + 7 + 17) / 3)�� �˴ϴ�.
 * �� �۾��� ���� [�۾��� ��û�Ǵ� ����, �۾��� �ҿ�ð�]�� ���� 2���� �迭 jobs�� �Ű������� �־��� ��, 
 * �۾��� ��û���� ������� �ɸ� �ð��� ����� ���� ���̴� ������� ó���ϸ� ����� �󸶰� �Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���. (��, �Ҽ��� ������ ���� �����ϴ�)
 */
package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DiskController {

	public static void main(String[] args) {
		DiskController theDiskController = new DiskController();
		int[][] jobs = { { 0, 3 }, { 1, 9 }, { 2, 6 } };
		System.out.println(theDiskController.solution(jobs));
	}

	public int solution(int[][] jobs) {
		PriorityQueue<Task> pq = new PriorityQueue<>();
		for (int i = 0; i < jobs.length; ++i) {
			pq.add(new Task(jobs[i][0], jobs[i][1]));
		}

		List<Task> taskList = new ArrayList<>();
		for (int j = 0; j < jobs.length; ++j) {
			taskList.add(pq.poll());
		}

		int time = 0;
		int sum = 0;

		while (taskList.size() > 0) {
			for (int k = 0; k < taskList.size(); ++k) {
				if (time >= taskList.get(k).sequence) {
					time += taskList.get(k).worktime;
					sum += time - taskList.get(k).sequence;
					taskList.remove(k);
					break;
				}
				if (k == taskList.size() - 1)
					time++;
			}
		}
		int answer = (sum/jobs.length);
		return answer;
	}

	class Task implements Comparable<Task> {
		int sequence;
		int worktime;

		public Task(int sequence, int worktime) {
			this.sequence = sequence;
			this.worktime = worktime;
		}

		@Override
		public int compareTo(Task anotherTask) {
			if (this.worktime < anotherTask.worktime)
				return -1;
			else if (this.worktime == anotherTask.worktime) {
				if (this.sequence < anotherTask.sequence)
					return -1;
				else
					return 1;
			} else
				return 1;
		}
	}
}
