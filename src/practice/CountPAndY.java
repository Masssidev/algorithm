/*�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. 
 * s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
 * 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

������� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 50 ������ �ڿ���
���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
*/
package practice;

import java.util.Scanner;

public class CountPAndY {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("���ڿ��� �Է����ּ���: ");
			String s = scanner.next();

			System.out.println(solution(s));
		}
	}

	private static boolean solution(String s) {
		s=s.toUpperCase();
		int length = s.length();
		int pCount = 0;
		int yCount = 0;
		for (int i = 0; i < length; ++i) {
			if (s.charAt(i) == 'P')
				pCount++;
			else if (s.charAt(i) == 'Y')
				yCount++;
		}
		return pCount == yCount;
	}
}
