/*
 * �����̵��� ���� �ٸ� ���� �����Ͽ� �Ծ� �ڽ��� �����մϴ�.
 * ���� ��� �����̰� ���� ���� �Ʒ��� ���� ���� �����̰� ���׶� �Ȱ�, �� ��Ʈ, �Ķ��� Ƽ������ �Ծ��ٸ� 
 * �������� û������ �߰��� �԰ų� ���׶� �Ȱ� ��� ���� ���۶󽺸� �����ϰų� �ؾ� �մϴ�.
 * ����	�̸�
 * ��	���׶� �Ȱ�, ���� ���۶�
 * ����	�Ķ��� Ƽ����
 * ����	û����
 * �ѿ�	�� ��Ʈ
 * �����̰� ���� �ǻ���� ��� 2���� �迭 clothes�� �־��� �� ���� �ٸ� ���� ������ ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

	public static void main(String[] args) {
		Camouflage camouflage = new Camouflage();
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		System.out.println(camouflage.solution(clothes));
	}

	public int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < clothes.length; ++i) {
			if (!hm.containsKey(clothes[i][1]))
				hm.put(clothes[i][1], 1);
			else
				hm.replace(clothes[i][1], hm.get(clothes[i][1]) + 1);
		}

		for (int value : hm.values())
			answer *= value + 1;
		return answer - 1;
	}

}
