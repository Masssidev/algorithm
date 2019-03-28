/*
 * n���� ���� �ƴ� ������ �ֽ��ϴ�. �� ���� ������ ���ϰų� ���� Ÿ�� �ѹ��� ������� �մϴ�. ���� ��� [1, 1, 1, 1, 1]�� ���� 3�� ������� ���� �ټ� ����� �� �� �ֽ��ϴ�.
 * ����� �� �ִ� ���ڰ� ��� �迭 numbers, Ÿ�� �ѹ� target�� �Ű������� �־��� �� ���ڸ� ������ ���ϰ� ���� Ÿ�� �ѹ��� ����� ����� ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

public class TargetNumber {

	public static void main(String[] args) {
		TargetNumber theTargetNumber = new TargetNumber();
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;
		System.out.println(theTargetNumber.solution(numbers, target));
	}

	public int dfs(int[] numbers, int target, int idx, int num) {
		if (idx == numbers.length)
			return num == target ? 1 : 0;
		else
			return dfs(numbers, target, idx + 1, num + numbers[idx])
					+ dfs(numbers, target, idx + 1, num - numbers[idx]);
	}

	public int solution(int[] numbers, int target) {
		return new TargetNumber().dfs(numbers, target, 0, 0);
	}
}
