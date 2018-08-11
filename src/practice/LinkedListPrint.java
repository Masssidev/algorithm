/*
 * printAll 메소드 구현
 */
package practice;

public class LinkedListPrint {
	static class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public void printAll() {
			System.out.print(value);
			for (; next != null; next = next.next) {
				System.out.print(" " + next.value);
			}
		}
	}

	public static void main(String[] args) {
		Node root = null;
		for (int i = 1; i <= 10; ++i)
			root = new Node(i, root);

		root.printAll();
	}
}
