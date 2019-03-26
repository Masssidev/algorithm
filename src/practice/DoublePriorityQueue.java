/*
 * 이중 우선순위 큐는 다음 연산을 할 수 있는 자료구조를 말합니다.
 * 명령어 		|	수신 탑(높이)
 * I 숫자          |  	큐에 주어진 숫자를 삽입합니다.
 * D 1      | 	큐에서 최댓값을 삭제합니다.
 * D -1	    |   큐에서 최솟값을 삭제합니다.
 * 이중 우선순위 큐가 할 연산 operations가 매개변수로 주어질 때, 
 * 모든 연산을 처리한 후 큐가 비어있으면 [0,0] 비어있지 않으면 [최댓값, 최솟값]을 return 하도록 solution 함수를 구현해주세요.
 */
package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class DoublePriorityQueue {

	public static void main(String[] args) {
		DoublePriorityQueue theDoublePriorityQueue = new DoublePriorityQueue();
		String[] operations = { "I 16", "D 1", "I 5" };
		System.out.println(Arrays.toString(theDoublePriorityQueue.solution(operations)));
	}

	public int[] solution(String[] operations) {
		int[] answer = {0, 0};
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        PriorityQueue<Integer> reversePriorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i=0; i<operations.length; i++) {
            String temp[] = operations[i].split(" ");
            switch(temp[0]) {
            case "I" : 
            	priorityQueue.add(Integer.parseInt(temp[1]));
            	reversePriorityQueue.add(Integer.parseInt(temp[1]));
                break;
            case "D" :
                if(priorityQueue.size() > 0) {
                    if(Integer.parseInt(temp[1]) == 1) {
                        int max = reversePriorityQueue.poll();
                        priorityQueue.remove(max);
                    } else {
                        int min = priorityQueue.poll();
                        reversePriorityQueue.remove(min);
                    }
                }
                break;
            }
        }

        if(priorityQueue.size() >= 1) {
            answer[0] = reversePriorityQueue.poll();
            answer[1] = priorityQueue.poll();
        }
        
		return answer;
	}
}
