/*
 * ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 * s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
 */
package practice;

import java.util.Arrays;

public class OrderByDesc {

	public static void main(String[] args) {
		OrderByDesc theOrderByDesc = new OrderByDesc();
		String s = "Zbcdefg";
		System.out.println(theOrderByDesc.solution(s));
	}

	public String solution(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new StringBuilder(new String(arr)).reverse().toString();
	}
}
