/*
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 
 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 */
package practice;

public class BetweenSum {

	public static void main(String[] args) {
		BetweenSum theBetweenSum = new BetweenSum();
		int a = 3;
		int b = 5;
		System.out.println(theBetweenSum.solution(a, b));
	}

	public long solution(int a, int b) {
		long answer = 0;
	      int temp = 0;
	      if(a > b) {
	          temp = a;
	          a = b;
	          b = temp;
	      }
	      
	      for(int i = a; i <= b; ++i) {
	          answer += i;
	      }
	      return answer;
	  }
}
