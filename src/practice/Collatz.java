/*
문제 설명
1937년 Collatz란 사람에 의해 제기된 이 추측은, 입력된 수가 짝수라면 2로 나누고, 홀수라면 3을 곱하고 1을 더한 다음, 결과로 나온 수에 같은 작업을 1이 될 때까지 반복할 경우 모든 수가 1이 된다는 추측입니다. 
예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 
입력된 수가 몇 번 만에 1이 되는지 반환하는 함수, solution을 완성해 주세요. 
단, 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.

제한 사항
입력된 수, num은 1 이상 8000000 미만인 정수입니다.
*/
package practice;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("정수를 입력해주세요: ");
			int num = scanner.nextInt();

			System.out.println(solution(num));
		}
	}

	private static int solution(int num) {
		int count = 0;
		while (num != 1) {
			if (count == 500)
				return -1;
			num = (num % 2 == 0 ? num / 2 : num * 3 + 1);
			count++;
		}
		return count;
	}
}
