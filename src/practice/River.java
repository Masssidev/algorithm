/*
 * 트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 
 * 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
 * ※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
 * solution 함수의 매개변수로 다리 길이 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭별 무게 truck_weights가 주어집니다. 
 * 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
 */
package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class River {

	public static void main(String[] args) {
		River theRiver = new River();
		int bridgeLength = 2;
		int weight = 10;
		int[] truckWeights = { 7, 4, 5, 6 };
		System.out.println(theRiver.solution(bridgeLength, weight, truckWeights));
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int time = 0;
		int weightLeft = weight;
		Truck truck = null;

		Queue<Truck> outside = new LinkedList<Truck>();
		List<Truck> inside = new ArrayList<Truck>();

		for (int t : truck_weights) {
			outside.add(new Truck(t, bridge_length));
		}

		while (!(inside.isEmpty() && outside.isEmpty())) {
			time++;

			if (!inside.isEmpty() && inside.get(0).distance <= 0) {
				weightLeft += inside.get(0).weight;
				inside.remove(0);
			}

			if (!outside.isEmpty() && weightLeft - outside.peek().weight >= 0) {
				weightLeft -= outside.peek().weight;
				inside.add(outside.poll());
			}

			for (int i = 0; i < inside.size(); i++) {
				truck = inside.get(i);
				truck.distance--;
			}
		}
		return time;
	}

}

class Truck {
	int weight;
	int distance;

	public Truck(int weight, int distance) {
		this.weight = weight;
		this.distance = distance;
	}
}
