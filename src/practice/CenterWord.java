/*
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 */
package practice;

public class CenterWord {

	public static void main(String[] args) {
		CenterWord theCenterWord = new CenterWord();
		String s = "aba";
		System.out.println(theCenterWord.solution(s));
	}

	public String solution(String s) {
		int length = s.length();
		int center = (length % 2 == 0 ? (length / 2) - 1 : (length / 2));
		String answer = length % 2 == 0 ? s.substring(center, center + 2) : s.substring(center, center + 1);
		return answer;
	}

}
