/*
 * 2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
 * ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�. 
 * ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
 * 2016���� �����Դϴ�.
 */
package practice;

public class Year2016 {

	public static void main(String[] args) {
		Year2016 theYear2016 = new Year2016();
		int a = 5;
		int b = 24;
		System.out.println(theYear2016.solution(a, b));
	}

	public String solution(int a, int b) {
	      int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	      String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
	      int total = 0;
	      for(int i=0; i<a-1; ++i) {
	          total += days[i];
	      }
	      total += b;
	      
	      String answer = day[total%7];
	      return answer;
	  }
}
