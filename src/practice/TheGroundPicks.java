/*
���� ����
�����Ա� ������ �Ϸ��� �մϴ�. �����Ա� ������ ��(land)�� �� N�� 4���� �̷���� �ְ�, ��� ĭ���� ������ ���� �ֽ��ϴ�. 
1����� ���� ������ �� �྿ ������ ��, �� ���� 4ĭ �� �� ĭ�� �����鼭 �����;� �մϴ�. 
��, �����Ա� ���ӿ��� �� �྿ ������ ��, ���� ���� �����ؼ� ���� �� ���� Ư�� ��Ģ�� �ֽ��ϴ�.

���� ���,

| 1 | 2 | 3 | 5 |

| 5 | 6 | 7 | 8 |

| 4 | 3 | 2 | 1 |

�� ���� �־����ٸ�, 1�࿡�� �׹�° ĭ (5)�� �������, 2���� �׹�° ĭ (8)�� ���� �� �����ϴ�.

������ ����� ��� �������� ��, ���� �� �ִ� ������ �ִ밪�� return�ϴ� solution �Լ��� �ϼ��� �ּ���. 
�� ���� ���, 1���� �׹�° ĭ (5), 2���� ����° ĭ (7), 3���� ù��° ĭ (4) ���� ��� 16���� �ְ����� �ǹǷ� 16�� return �ϸ� �˴ϴ�.

���ѻ���
���� ���� N : 100,000 ������ �ڿ���
���� ������ 4���̰�, ��(land)�� 2���� �迭�� �־����ϴ�.
���� : 100 ������ �ڿ���
*/
package practice;

import java.util.Scanner;

public class TheGroundPicks {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("����� ũ�⸦ �Է����ּ���: ");
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			int[][] matrix = new int[row][column];
			System.out.print("����� ��Ҹ� �Է����ּ���: ");
			for (int i = 0; i < matrix.length; ++i) {
				for (int j = 0; j < matrix[i].length; ++j) {
					matrix[i][j] = scanner.nextInt();
				}
			}

			System.out.println(solution(matrix));
		}
	}
	
	private static int solution(int[][] matrix) {
		for(int i=0; i<matrix.length-1; ++i) {
			matrix[i+1][0] += Math.max(matrix[i][1], Math.max(matrix[i][2], matrix[i][3]));
			matrix[i+1][1] += Math.max(matrix[i][0], Math.max(matrix[i][2], matrix[i][3]));
			matrix[i+1][2] += Math.max(matrix[i][0], Math.max(matrix[i][1], matrix[i][3]));
			matrix[i+1][3] += Math.max(matrix[i][0], Math.max(matrix[i][1], matrix[i][2]));
		}
		return Math.max(matrix[matrix.length-1][0], Math.max(matrix[matrix.length-1][1], Math.max(matrix[matrix.length-1][2], matrix[matrix.length-1][3])));
	}

}
