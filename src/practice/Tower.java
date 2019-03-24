/*
 * ���� ������ ž N�븦 �������ϴ�. ��� ž�� ����⿡�� ��ȣ�� ��/�����ϴ� ��ġ�� ��ġ�߽��ϴ�. 
 * �߻��� ��ȣ�� ��ȣ�� ���� ž���� ���� ž������ �����մϴ�. ����, �� �� ���ŵ� ��ȣ�� �ٸ� ž���� �۽ŵ��� �ʽ��ϴ�.
 * ���� ��� ���̰� 6, 9, 5, 7, 4�� �ټ� ž�� �������� ���ÿ� ������ ��ȣ�� �߻��մϴ�. 
 * �׷���, ž�� ������ ���� ��ȣ�� �ְ�޽��ϴ�. ���̰� 4�� �ټ� ��° ž���� �߻��� ��ȣ�� ���̰� 7�� �� ��° ž�� �����ϰ�, 
 * ���̰� 7�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž��, ���̰� 5�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž�� �����մϴ�. 
 * ���̰� 9�� �� ��° ž�� ���̰� 6�� ù ��° ž�� ���� ������ ��ȣ�� � ž������ ������ �� �����ϴ�.
 * �� ���ʺ��� ������� ž�� ���̸� ���� �迭 heights�� �Ű������� �־��� �� �� ž�� �� ��ȣ�� ��� ž���� �޾Ҵ��� ����� �迭�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

import java.util.Arrays;

public class Tower {

	public static void main(String[] args) {
		Tower theTower = new Tower();
		int[] heights = { 6, 9, 5, 7, 4 };
		System.out.println(Arrays.toString(theTower.solution(heights)));
	}

	public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
         
        for(int start = heights.length - 1; start > 0; start--){
            for(int end = start - 1; end >= 0; end--){
                if(heights[start] < heights[end]){
                    answer[start] = (end + 1);
                    break;
                }
                if(end == 0){
                    answer[start] = 0;
                    break;
                }
            }
        }
        answer[0] = 0;
        return answer;
	}
}
