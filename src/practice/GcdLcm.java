/*
�� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. 
�迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.

���� ����
�� ���� 1�̻� 1000000������ �ڿ����Դϴ�.
*/
package practice;

import java.util.Arrays;

public class GcdLcm {

	public static void main(String[] args) {
		GcdLcm theGcmLcm = new GcdLcm();
		int n = 3;
		int m = 12;
		System.out.println(Arrays.toString(theGcmLcm.solution(n, m)));
	}

	public int[] solution(int n, int m) {
		int[] answer = { gcd(n, m), lcm(n, m) };
		return answer;
	}

	public int gcd(int n, int m) {
		if (n < m) {
			int temp = n;
			n = m;
			m = temp;
		}
		int r = 1;
		while (r > 0) {
			r = n % m;
			n = m;
			m = r;
		}
		return n;
	}

	public int lcm(int n, int m) {
		return n * m / gcd(n, m);
	}
}
