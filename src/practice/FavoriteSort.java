/*
 * ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
 * ���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a�� strings�� �����մϴ�.
 */
package practice;

import java.util.Arrays;
import java.util.Comparator;

public class FavoriteSort {

	public static void main(String[] args) {
		FavoriteSort theFavoriteSort = new FavoriteSort();
		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;
		System.out.println(Arrays.toString(theFavoriteSort.solution(strings, n)));
	}

	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.charAt(n) > o2.charAt(n))
					return 1;
				else if (o1.charAt(n) == o2.charAt(n))
					return o1.compareTo(o2);
				else
					return -1;
			}

		});
		
		return strings;
	}
}
