/*길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
    예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
*/
package practice;

import java.util.Scanner;

public class Append {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("갯수를 입력해주세요: ");
			int length = scanner.nextInt();

			System.out.println(solution(length));
		}
	}

	private static String solution(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; ++i) {
			sb.append((i % 2 == 0 ? "수" : "박"));
		}
		return sb.toString();
	}

}
