/*
 * printAll 메소드 재귀적 구현
 */
package practice;

public class LinkedListResursivePrint {
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
	}

	public static void main(String[] args) {
		Node root = null;
		for (int i = 1; i <= 10; ++i)
			root = new Node(i, root);

		root.printAll();
	}

}
