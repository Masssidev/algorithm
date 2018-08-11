/*
 * 1부터 n까지 합계를 계산하는 sum 함수를 재귀 호출로 구현.
 */
package practice;

public class Recursive {

	public static void main(String[] args) {
		for (int i = 3; i <= 10; ++i) {
			System.out.printf("%d %d\n", i, sum(i));
		}
	}

	private static int sum(int n) {
		return (n <= 1 ? 1 : n + sum(n - 1));
	}
}
