/*
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.
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
