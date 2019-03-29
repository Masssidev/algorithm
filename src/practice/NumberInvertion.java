/*
 * �ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.
 */
package practice;

import java.util.Arrays;

public class NumberInvertion {

	public static void main(String[] args) {
		NumberInvertion theNumberInvertion = new NumberInvertion();
		int n = 12345;
		System.out.println(Arrays.toString(theNumberInvertion.solution(n)));
	}

	public int[] solution(long n) {
		int[] answer = new int[String.valueOf(n).length()];
		int idx = 0;
		while (n != 0) {
			answer[idx++] = (int)(n % 10);
			n /= 10;
		}
		return answer;
	}
}
