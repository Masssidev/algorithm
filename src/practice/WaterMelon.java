/*
 * 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
 */
package practice;

public class WaterMelon {

	public static void main(String[] args) {
		WaterMelon theWaterMelon = new WaterMelon();
		int n = 4;
		System.out.println(theWaterMelon.solution(n));
	}

	public String solution(int n) {
		char[] arr = { '수', '박' };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; ++i)
			sb.append(arr[i % 2]);
		return sb.toString();
	}
}
