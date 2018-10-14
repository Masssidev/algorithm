/*
 * 여러 문장들로 이루어진 문자열이 주어질 때 해당 문장들 중 단어의 수가 가장 많은 문장의 단어 수를 구하시오.
 * 문장들은 ., ?, !로 구별하며 단어들은 띄어쓰기로 구분한다.
 * 띄어쓰기는 한 번에 여러 번 있을 수 있다.
 */
package practice;

import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		String S = "Forget    CVs..Save     time . x x";
		StringTokenizer sentences = new StringTokenizer(S, ".?!");
        
		int resultCount = 0;
        while(sentences.hasMoreTokens()) { 
            String sentence = sentences.nextToken(); 
            String[] words = sentence.replaceAll("\\s{2,}", " ").trim().split(" ");
            int count = words.length;
            if(resultCount < count)
            	resultCount = count;
        }
		
        System.out.println(resultCount);
	}

}
