/*
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
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
