/*
 * �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. 
 * s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
 * 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
 * ������� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.
 */
package practice;

public class TheNumberOfPY {

	public static void main(String[] args) {
		TheNumberOfPY theNumberOfPY = new TheNumberOfPY();
		String s = "pPoooyY";
		System.out.println(theNumberOfPY.solution(s));
	}

	boolean solution(String s) {
        int theNumberOfY = 0;
        int theNumberOfP = 0;
        
        for(int i=0; i<s.length(); ++i) {
            if(s.toUpperCase().charAt(i) == 'Y')
                theNumberOfY++;
            else if (s.toUpperCase().charAt(i) == 'P')
                theNumberOfP++;
        }

        return theNumberOfY == theNumberOfP;
    }

}
