/*
 * ���� �켱���� ť�� ���� ������ �� �� �ִ� �ڷᱸ���� ���մϴ�.
 * ��ɾ� 		|	���� ž(����)
 * I ����          |  	ť�� �־��� ���ڸ� �����մϴ�.
 * D 1      | 	ť���� �ִ��� �����մϴ�.
 * D -1	    |   ť���� �ּڰ��� �����մϴ�.
 * ���� �켱���� ť�� �� ���� operations�� �Ű������� �־��� ��, 
 * ��� ������ ó���� �� ť�� ��������� [0,0] ������� ������ [�ִ�, �ּڰ�]�� return �ϵ��� solution �Լ��� �������ּ���.
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
