/*
 * Ʈ�� ���� �밡 ���� ���������� �� ���� �ٸ��� ������ ������ �ǳʷ� �մϴ�. ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� �˾Ƴ��� �մϴ�. 
 * Ʈ���� 1�ʿ� 1��ŭ �����̸�, �ٸ� ���̴� bridge_length�̰� �ٸ��� ���� weight���� �ߵ��ϴ�.
 * �� Ʈ���� �ٸ��� ������ ������ ���� ���, �� Ʈ���� ���Դ� ������� �ʽ��ϴ�.
 * solution �Լ��� �Ű������� �ٸ� ���� bridge_length, �ٸ��� �ߵ� �� �ִ� ���� weight, Ʈ���� ���� truck_weights�� �־����ϴ�. 
 * �̶� ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
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
