/*
 * addTail 메소드  재귀적 구현
 * 출력: 0 1 2 3 4 5 6 7 8 9 10
 */
package practice;

public class MakeRecursiveAddTail {
	static class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public void printAll() {
			System.out.print(" " + value);
			if (next != null)
				next.printAll();
		}

		public void addTail(int value) {
			if (next == null)
				next = new Node(value, null);
			else
				next.addTail(value);
		}
	}

	public static void main(String[] args) {
		Node root = new Node(0, null);
		for (int i = 1; i <= 10; ++i)
			root.addTail(i);

		root.printAll();
	}
}
