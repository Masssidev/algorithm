/* 주어지는 배열의 각 요소들은 인덱스를 나타낸다. 
 * 인덱스를 나타내는 요소들로 이어지는 리스트를 만들 때 리스트의 길이를 반환하시오.
 * 배열의 첫 번째 원소는 1번 인덱스를 가리키는 숫자 1이 들어 있다.
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
