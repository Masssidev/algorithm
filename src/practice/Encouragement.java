/*
 * 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
 */
package practice;

public class Encouragement {

	public static void main(String[] args) {
		String message = "강한친구 대한육군";
		System.out.println(new StringBuilder(message).append("\n").append(message).toString());
	}

}
