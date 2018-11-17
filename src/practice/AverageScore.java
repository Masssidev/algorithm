/*
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 
 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */
package practice;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		int count = 0;

		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < count; ++i) {
			int people = scan.nextInt();
			double total = 0;
			double[] scores = new double[people];

			for (int j = 0; j < people; ++j) {
				scores[j] = scan.nextDouble();
				total += scores[j];
			}

			double average = total / scores.length;
			double aboveTheAverage = 0;

			for (int k = 0; k < scores.length; ++k) {
				if (scores[k] > average)
					aboveTheAverage++;
			}

			sb.append(String.format("%.3f", aboveTheAverage / scores.length * 100));
			sb.append("%\n");
		}
		scan.close();
		System.out.println(sb.toString());
	}

}
