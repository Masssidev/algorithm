/*
 * n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
 * 사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
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
