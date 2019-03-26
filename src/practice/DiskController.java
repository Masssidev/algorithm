/*
 * 하드디스크는 한 번에 하나의 작업만 수행할 수 있습니다. 디스크 컨트롤러를 구현하는 방법은 여러 가지가 있습니다. 가장 일반적인 방법은 요청이 들어온 순서대로 처리하는 것입니다.
 * 한 번에 하나의 요청만을 수행할 수 있기 때문에 각각의 작업을 요청받은 순서대로 처리하면 다음과 같이 처리 됩니다.
 * 이 때 각 작업의 요청부터 종료까지 걸린 시간의 평균은 10ms(= (3 + 11 + 16) / 3)가 됩니다.
 * 하지만 A → C → B 순서대로 처리하면 이렇게 A → C → B의 순서로 처리하면 각 작업의 요청부터 종료까지 걸린 시간의 평균은 9ms(= (3 + 7 + 17) / 3)가 됩니다.
 * 각 작업에 대해 [작업이 요청되는 시점, 작업의 소요시간]을 담은 2차원 배열 jobs가 매개변수로 주어질 때, 
 * 작업의 요청부터 종료까지 걸린 시간의 평균을 가장 줄이는 방법으로 처리하면 평균이 얼마가 되는지 return 하도록 solution 함수를 작성해주세요. (단, 소수점 이하의 수는 버립니다)
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
