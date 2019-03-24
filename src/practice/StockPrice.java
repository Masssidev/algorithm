/*
 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
 */
package practice;

import java.util.Arrays;

public class StockPrice {

	public static void main(String[] args) {
		StockPrice theStockPrice = new StockPrice();
		int[] prices = { 1, 2, 3, 2, 3 };
		System.out.println(Arrays.toString(theStockPrice.solution(prices)));
	}

	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
         
        for(int start = 0; start < prices.length - 1; ++start){
            for(int end = start + 1; end < prices.length; ++end){
                if(prices[start] > prices[end] || end == prices.length - 1){
                    answer[start] = end - start;
                    break;
                }
            }
        }
        answer[prices.length - 1] = 0;
        return answer;
    }
}
