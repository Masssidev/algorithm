/*
 * �� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
 * ���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
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
