/*
 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
 */
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class NewAverage {

	public static void main(String[] args) {
		int count = 0;

		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();

		double[] numbers = new double[count];
		for (int i = 0; i < numbers.length; ++i) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(numbers);

		double max = numbers[numbers.length - 1];
		double total = 0;
		for (int j = 0; j < numbers.length; ++j) {
			total += numbers[j] / max * 100;
		}
		System.out.println(total / numbers.length);
	}

}
