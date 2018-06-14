/*
문제 설명
일직선으로 나열된 도시 n개로 이루어진 나라가 있습니다. 이번에 이 나라에서는 n개의 도시 중 한 도시에 공항을 짓기로 하였습니다. 공항이 지어질 도시의 조건은 다음과 같습니다.

각 도시의 모든 거주민이 모두 공항을 사용한다고 가정해, 모든 사람의 이동 거리의 합이 최소가 되는 도시에 공항을 짓습니다.
이동 거리의 합이 최소가 되는 공항이 여러개가 있으면 위치가 더 작은 도시에 공항을 짓습니다.
예를 들어서 1에 위치한 도시에 5명의 사람이, 2에 위치한 도시에 2명의 사람이, 3에 위치한 도시에 3명의 사람이 산다고 하겠습니다.
1에 위치한 도시에 공항을 짓는다면 총 이동 거리는 5 * 0 + 2 * 1 + 3 * 2 = 8
2에 위치한 도시에 공항을 짓는다면 총 이동 거리는 5 * 1 + 2 * 0 + 3 * 1 = 8
3에 위치한 도시에 공항을 짓는다면 총 이동 거리는 5 * 2 + 2 * 1 + 3 * 0 = 12
따라서 이 경우는 1에 위치한 도시을 짓게 됩니다.

도시의 위치와 그 도시에 사는 사람의 수 cities가 매개변수로 주어질 때, 공항을 지을 도시의 위치를 return 하는 solution 함수를 완성해 주세요.

제한사항
도시의 위치는 -100,000 이상 100,000이하인 정수 입니다.
cities를 구성하는 원소의 첫번째 값은 도시의 위치를, 두번째 값은 도시에 사는 사람 수를 의미 합니다.
이 나라의 도시는 10,000개 이하입니다.
*/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class AirportBuild {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("2차원 배열의 크기를 입력해주세요: ");
			int raw = scanner.nextInt();
			int column = scanner.nextInt();
			int[][] arr = new int[raw][column];
			System.out.print("배열의 요소를 입력해주세요: ");
			for (int i = 0; i < arr.length; ++i) {
				for (int j = 0; j < arr[0].length; ++j) {
					arr[i][j] = scanner.nextInt();
				}
			}

			System.out.println(solution(arr));
		}
		
	}

	private static int solution(int[][] arr) {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; ++i) {
			int sum = 0;
			int temp = arr[i][0];
			for (int j = 0; j < arr.length; ++j) {
				sum += arr[j][1] * Math.abs(arr[j][0] - temp);
			}
			result[i] = sum;
		}

		int min = Integer.MAX_VALUE;
		for (int k = 0; k < arr.length; ++k) {
			if (result[k] < min)
				min = k + 1;
		}

		return min;
	}
}
