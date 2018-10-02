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
