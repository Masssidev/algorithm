/*
 * ��� ���忡���� �Ϸ翡 �а��縦 1�澿 ����մϴ�. ���� �а��縦 ���޹޴� ������ �������� ������ k�� ���Ŀ��� �а��縦 ���޹��� �� �ֱ� ������ �ؿ� ���忡�� �а��縦 �����ؾ� �մϴ�.
 * �ؿ� ���忡���� ���� �а��縦 ������ �� �ִ� ��¥�� ������ �˷��־���, ��� ���忡���� ��ۺ� ���̱� ���� �ּ����� Ƚ���� �а��縦 ���޹ް� �ͽ��ϴ�.
 * ���� ���忡 �����ִ� �а��� ���� stock, �а��� ���� ����(dates)�� �ش� ������ ���� ������ �а��� ����(supplies), ���� �������κ��� ���޹��� �� �ִ� ���� k�� �־��� ��, �а��簡 �������� �ʰ� ������ ��ϱ� ���ؼ� �ּ��� �� �� �ؿ� �������κ��� �а��縦 ���޹޾ƾ� �ϴ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
 * dates[i]���� i��° ���� �������� ���������, supplies[i]���� dates[i] ��¥�� ���� ������ �а��� ������ ��� �ֽ��ϴ�.
 */
package practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class RamenFactory {

	public static void main(String[] args) {
		RamenFactory theRamenFactory = new RamenFactory();
		int stock = 4;
		int[] dates = { 4, 10, 15 };
		int[] supplies = { 20, 5, 10 };
		int k = 30;
		System.out.println(theRamenFactory.solution(stock, dates, supplies, k));
	}

	public int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;
		int day = stock;
		int index = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		while (day < k) {
			while (index < dates.length && dates[index] <= day) {
				pq.add(supplies[index]);
				index++;
			}
			answer++;
			day += pq.poll();
		}
		return answer;
	}
}
