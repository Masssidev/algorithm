/*
 * �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
 * ������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
 */
package practice;

public class OrderOfMagnitude {

	public static void main(String[] args) {
		OrderOfMagnitude theOrderOfMagnitude = new OrderOfMagnitude();
		int n = 987;
		System.out.println(theOrderOfMagnitude.solution(n));
	}

	public int solution(int n) {
		int answer = 0;
		while (n != 0) {
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}

}
