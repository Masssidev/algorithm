/*
 * �ڿ��� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 */
package practice;

public class DivisiorSum {

	public static void main(String[] args) {
		DivisiorSum theDivisiorSum = new DivisiorSum();
		int n = 12;
		System.out.println(theDivisiorSum.solution(n));
	}

	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n / 2; ++i) {
			if (n % i == 0)
				answer += i;
		}
		answer += n;
		return answer;
	}

}
