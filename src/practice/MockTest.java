/*
 * �����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.
 * 1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

import java.util.Arrays;

public class MockTest {

	public static void main(String[] args) {
		MockTest theMockTest = new MockTest();
		int[] answers = { 1,2,3,4,5 };
		System.out.println(Arrays.toString(theMockTest.solution(answers)));
	}
	
	public int[] solution(int[] answers) {
		int[] arr = new int[3];
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == a[(i)%a.length]) arr[0]++;
            if(answers[i] == b[(i)%b.length]) arr[1]++;
            if(answers[i] == c[(i)%c.length]) arr[2]++;
        }

        int maxScore = Math.max(arr[0], Math.max(arr[1], arr[2]));

        if(maxScore == arr[0] && maxScore == arr[1] && maxScore == arr[2]) return new int[]{1,2,3};
        else if(maxScore == arr[0] && maxScore == arr[1]) return new int[]{1,2};
        else if(maxScore == arr[0] && maxScore == arr[2]) return new int[]{1,3};
        else if(maxScore == arr[1] && maxScore == arr[2]) return new int[]{2,3};
        else if(maxScore == arr[0]) return new int[]{1};
        else if(maxScore == arr[1]) return new int[]{2};

        return new int[]{3};
    }
}
