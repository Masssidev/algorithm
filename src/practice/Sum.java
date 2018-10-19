package practice;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

			int num1 = scan.nextInt();
			int num2 = scan.nextInt();

			System.out.println(num1 + num2);
		}
	}
}
