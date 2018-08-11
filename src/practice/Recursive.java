/*
 * 1���� n���� �հ踦 ����ϴ� sum �Լ��� ��� ȣ��� ����.
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
