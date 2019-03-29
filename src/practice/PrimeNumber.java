/*
 * 
 */
package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber thePrimeNumber = new PrimeNumber();
		int n = 10;
		System.out.println(thePrimeNumber.solution(n));
	}

	public int solution(int n) {

		int amswer = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					++result;
				} else if (i % j == 0) {
					break;
				}
			}
		}
		return answer;
	}
}
