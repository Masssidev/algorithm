/*
 * ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
 * �����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
 * �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

import java.util.HashMap;
import java.util.Map;

public class Marathon {

	public static void main(String[] args) {
		Marathon marathon = new Marathon();
		String[] participant = { "leo", "kiki", "ma", "leo" };
		String[] completion = { "kiki", "leo", "ma" };
		System.out.println(marathon.solution(participant, completion));
	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		int val = 0;

		Map<String, Integer> hm = new HashMap<>();

		for (String part : participant) {
			if (hm.get(part) == null)
				hm.put(part, 1);
			else {
				val = hm.get(part) + 1;
				hm.put(part, val);
			}
		}

		for (String comp : completion) {
			val = hm.get(comp) - 1;
			hm.put(comp, val);
		}

		for (String key : hm.keySet()) {
			if (hm.get(key) == 1)
				answer = key;
		}
		return answer;
	}
}
