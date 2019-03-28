/*
 * �迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
 * �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. �迭 arr���� ���� �ǰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���. 
 * ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. 
 * �������
 * arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
 * arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
 * �迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
 */
package practice;

import java.util.Arrays;
import java.util.Stack;

public class Deduplication {

	public static void main(String[] args) {
		Deduplication theDeduplication = new Deduplication();
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println(Arrays.toString(theDeduplication.solution(arr)));
	}

	public int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		for (int i = 1; i < arr.length; ++i) {
			if (stack.peek() != arr[i])
				stack.push(arr[i]);
		}
		
		
		int[] answer = new int[stack.size()];
		int idx = 0;
		for(int value : stack){
			answer[idx++] = value;
		}
		return answer;
	}
}
