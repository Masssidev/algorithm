/*
 * �� ���� �ּҰ����(Least Common Multiple)�� �Էµ� �� ���� ��� �� ������ �Ǵ� ���� ���� ���ڸ� �ǹ��մϴ�. 
 * ���� ��� 2�� 7�� �ּҰ������ 14�� �˴ϴ�. 
 * ���Ǹ� Ȯ���ؼ�, n���� ���� �ּҰ������ n ���� ������ ��� �� ������ �Ǵ� ���� ���� ���ڰ� �˴ϴ�. 
 * n���� ���ڸ� ���� �迭 arr�� �ԷµǾ��� �� �� ������ �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� �ּ���.
 */
package practice;

public class Gcd {

	public static void main(String[] args) {
		Gcd theGcd = new Gcd();
		int[] arr = { 2, 6, 8, 14 };
		System.out.println(theGcd.solution(arr));
	}

	public int solution(int[] arr) {
		int answer = arr[0];
		for (int i = 1; i < arr.length; ++i) {
			answer = lcm(answer, arr[i]);
		}
		return answer;
	}

	public int lcm(int n1, int n2) {
		return n1 * n2 / gcd(n1, n2);
	}

	public int gcd(int n1, int n2) {
		if (n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}

		int r = 1;
		while (r > 0) {
			r = n1 % n2;
			n1 = n2;
			n2 = r;
		}
		return n1;
	}
}
