/*
 * �� ���� �ܾ� begin, target�� �ܾ��� ���� words�� �ֽ��ϴ�. �Ʒ��� ���� ��Ģ�� �̿��Ͽ� begin���� target���� ��ȯ�ϴ� ���� ª�� ��ȯ ������ ã������ �մϴ�.
 * 1. �� ���� �� ���� ���ĺ��� �ٲ� �� �ֽ��ϴ�.
 * 2. words�� �ִ� �ܾ�θ� ��ȯ�� �� �ֽ��ϴ�.
 * ���� ��� begin�� hit, target�� cog, words�� [hot,dot,dog,lot,log,cog]��� hit -> hot -> dot -> dog -> cog�� ���� 4�ܰ踦 ���� ��ȯ�� �� �ֽ��ϴ�.
 * �� ���� �ܾ� begin, target�� �ܾ��� ���� words�� �Ű������� �־��� ��, �ּ� �� �ܰ��� ������ ���� begin�� target���� ��ȯ�� �� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
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
