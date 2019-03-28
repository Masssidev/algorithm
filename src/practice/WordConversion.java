/*
 * 두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.
 * 1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
 * 2. words에 있는 단어로만 변환할 수 있습니다.
 * 예를 들어 begin이 hit, target가 cog, words가 [hot,dot,dog,lot,log,cog]라면 hit -> hot -> dot -> dog -> cog와 같이 4단계를 거쳐 변환할 수 있습니다.
 * 두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.
 */
package practice;

public class WordConversion {

	public static void main(String[] args) {
		WordConversion theWordConversion = new WordConversion();
		String begin = "hit";
		String target = "cog";
		String[] words = { "dot", "dog", "hot", "lot", "log", "cog" };
		System.out.println(theWordConversion.solution(begin, target, words));
	}

	static boolean[] visit;

	public int dfs(String begin, String target, String[] words) {
		int answer = 0;
		String temp;

		for (int i = 0; i < words.length; i++) {
			if (visit[i])
				continue;

			for (int j = 0; j < begin.length(); j++) {
				temp = begin;
				temp = (j > 0 ? begin.substring(0, j) : "") + words[i].charAt(j)
						+ (j < begin.length() - 1 ? begin.substring(j + 1) : "");

				if (temp.equals(target))
					return 1;
				if (temp.equals(words[i])) {
					visit[i] = true;
					answer = 1;
					answer += dfs(temp, target, words);
				}
			}
		}
		return answer;
	}

	public int solution(String begin, String target, String[] words) {
		visit = new boolean[words.length];
		for (int i = 0; i < words.length; i++) {
			if (target.equals(words[i]))
				return dfs(begin, target, words);
		}
		return 0;
	}

}
