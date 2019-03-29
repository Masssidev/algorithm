/*
 * Finn�� ���� ���а��ο� ���� �ֽ��ϴ�. ���� ���θ� �ϴ� Finn�� �ڿ��� n�� ������ �ڿ������ ǥ�� �ϴ� ����� ��������� ����� �˰� �Ǿ����ϴ�. 
 * ������� 15�� ������ ���� 4������ ǥ�� �� �� �ֽ��ϴ�.
 * 1 + 2 + 3 + 4 + 5 = 15
 * 4 + 5 + 6 = 15
 * 7 + 8 = 15
 * 15 = 15
 * �ڿ��� n�� �Ű������� �־��� ��, ���ӵ� �ڿ������ n�� ǥ���ϴ� ����� ���� return�ϴ� solution�� �ϼ����ּ���.
 */
package practice;

public class NumericExpressions {

	public static void main(String[] args) {
		NumericExpressions theNumericExpressions = new NumericExpressions();
		int n = 15;
		System.out.println(theNumericExpressions.solution(n));
	}

	public int solution(int n) {
		int count = 1;
		for (int i = 1; i <= n; ++i) {
			int sum = 0;
			for (int j = i; j < n; ++j) {
				sum += j;
				if (sum > n)
					break;
				if (sum == n)
					count++;

			}
		}
		return count;
	}
}
