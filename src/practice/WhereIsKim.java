/*
 * String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. 
 * seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 */
package practice;

import java.util.Arrays;

public class WhereIsKim {

	public static void main(String[] args) {
		WhereIsKim theWhereIsKim = new WhereIsKim();
		String[] seoul = { "Jane", "Kim" };
		System.out.println(theWhereIsKim.solution(seoul));
	}

	public String solution(String[] seoul) {
		int idx = Arrays.asList(seoul).indexOf("Kim");
		String answer = "김서방은" + idx + "에 있다.";
		return answer;
	}
}
