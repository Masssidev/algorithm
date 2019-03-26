/*
 * Leo�� ī���� �緯 ���ٰ� �Ʒ� �׸��� ���� �߾ӿ��� ���������� ĥ���� �ְ� �𼭸��� �������� ĥ���� �ִ� ���� ��� ī���� �ý��ϴ�.
 * Leo�� ������ ���ƿͼ� �Ʊ� �� ī���� �������� �������� ��ĥ�� ������ ������ ���������, ��ü ī���� ũ��� ������� ���߽��ϴ�.
 * Leo�� �� ī�꿡�� ���� ������ �� brown, ������ ������ �� red�� �Ű������� �־��� �� ī���� ����, ���� ũ�⸦ ������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
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
