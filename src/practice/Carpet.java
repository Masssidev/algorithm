/*
 * Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 빨간색으로 칠해져 있고 모서리는 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
 * Leo는 집으로 돌아와서 아까 본 카펫의 빨간색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
 * Leo가 본 카펫에서 갈색 격자의 수 brown, 빨간색 격자의 수 red가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 */
package practice;

import java.util.Arrays;

public class Carpet {

	public static void main(String[] args) {
		Carpet theCarpet = new Carpet();
		int brown = 12;
		int red = 3;
		System.out.println(Arrays.toString(theCarpet.solution(brown, red)));
	}

	public int[] solution(int brown, int red) {
		int[] answer = {};
		answer = new int[2];
		int area = brown + red;
		int height = 0;

		for (int width = 1; width < brown; width++) {
			height = area / width;

			if ((width - 2) * (height - 2) == red) {
				answer[0] = width;
				answer[1] = height;
			}
		}
		return answer;

	}

}
