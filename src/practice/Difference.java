package practice;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		try (Scanner scan = new Scanner(System.in)) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
		}
		
		System.out.println(num1 - num2);
	}

}
