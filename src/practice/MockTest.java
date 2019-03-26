/*
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
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
