/*
 * ���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
 */
package practice;

public class WaterMelon {

	public static void main(String[] args) {
		WaterMelon theWaterMelon = new WaterMelon();
		int n = 4;
		System.out.println(theWaterMelon.solution(n));
	}

	public String solution(int n) {
		char[] arr = { '��', '��' };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; ++i)
			sb.append(arr[i % 2]);
		return sb.toString();
	}
}
