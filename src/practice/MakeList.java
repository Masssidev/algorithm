/* �־����� �迭�� �� ��ҵ��� �ε����� ��Ÿ����. 
 * �ε����� ��Ÿ���� ��ҵ�� �̾����� ����Ʈ�� ���� �� ����Ʈ�� ���̸� ��ȯ�Ͻÿ�.
 * �迭�� ù ��° ���Ҵ� 1�� �ε����� ����Ű�� ���� 1�� ��� �ִ�.
 */
package practice;

public class MakeList {

	public static void main(String[] args) {
		int[] A = { 1, 4, -1, 3, 2 };

		int tmp = A[0];
		int length = 0;
		for (int i = 0; i < A.length; ++i) {
			length++;
			if (tmp == -1) {
				System.out.println(length);
				return;
			} else
				tmp = A[tmp];
		}
	}

}
