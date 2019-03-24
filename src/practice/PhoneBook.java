/*
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
 * ��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
 * ������ : 119
 * ���ؿ� : 97 674 223
 * ������ : 11 9552 4421
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, 
 * � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
package practice;

public class PhoneBook {

	public static void main(String[] args) {
		PhoneBook thePhoneBook = new PhoneBook();
		String[] phoneBook = { "119", "97674223", "1195524421" };
		System.out.println(thePhoneBook.solution(phoneBook));
	}

	public boolean solution(String[] phone_book) {
		boolean flag = true;
		for (int i = 0; i < phone_book.length; ++i) {
			for (int j = 0; j < phone_book.length; ++j) {
				if (!phone_book[i].equals(phone_book[j]) && phone_book[i].startsWith(phone_book[j])) {
					flag = false;
					break;
				}
			}
			if (flag == false)
				break;
		}

		return flag;
	}
}
