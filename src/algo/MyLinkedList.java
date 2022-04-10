// MyLinkedList.java - (insert one line description here)
// (C) Copyright 2021 Hewlett Packard Enterprise Development LP

package algo;

/**
 *
 */
public class MyLinkedList<T> {

	static class Node<T> {

		T value;
		Node next;

		Node(final T value, final Node node) {
			this.value = value;
			this.next = node;
		}

		Node() {
		}

		Node(final T value) {
			this.value = value;
		}

		/**
		 * @return the value
		 */
		public T getValue() {
			return value;
		}

		/**
		 * @param value the value to set
		 */
		public void setValue(final T value) {
			this.value = value;
		}

		/**
		 * @return the node
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param node the node to set
		 */
		public void setNext(final Node node) {
			this.next = node;
		}

	}

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Node<Integer> head = new Node<>();
		final Node<Integer> first = new Node<>(1);
		final Node<Integer> second = new Node<>(2);
		final Node<Integer> third = new Node<>(3);

		head.setNext(first);
		first.setNext(second);
		second.setNext(third);
		addNode(head, new Node<Integer>(0));
		addNode(head, new Node<Integer>(-1));
		// removeNode(head);
		addBeforeNode(head, new Node<>(4), 3);
		printLinkedList(head);
		System.out.println(length(head));
		System.out.println(recurssiveLength(head));

	}

	public static void printLinkedList(final Node<Integer> head) {
		Node<Integer> currentNode = head;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			System.out.println(currentNode.getValue());
		}
	}

	/*
	 * insert in the beginning
	 *
	 */
	public static void addNode(final Node head, final Node toAdd) {
		if (head.next != null) {
			toAdd.next = head.next;
		}
		head.next = toAdd;
	}

	/*
	 * remove the last
	 *
	 * 1 currentNode.next != null && currentNode.next.next == null null 1, 2, 3
	 *
	 */
	public static void removeNode(final Node head) {
		Node currentNode = head;
		while (currentNode.next != null) {
			if (currentNode.next.next == null) {
				currentNode.next = null;
			} else {
				currentNode = currentNode.getNext();
			}
		}
	}

	/*
	 * 1, 2, 3 -> 4 before 2 1, 4, 2, 3
	 */
	public static void addBeforeNode(final Node<Integer> head, final Node<Integer> toAdd, final int value) {
		Node currentNode = head;
		if (head.next == null) {
			head.next = toAdd;
			return;
		}
		while (currentNode.next != null) {
			if (currentNode.next.value == (Integer) value) {
				toAdd.next = currentNode.next;
				currentNode.next = toAdd;
				break;
			} else {
				currentNode = currentNode.next;
			}
		}
	}

	public static int length(final Node<Integer> head) {
		Node currentNode = head;
		int count = 0;
		while (currentNode.next != null) {
			count++;
			currentNode = currentNode.getNext();
		}
		return count;
	}

	static int recurssiveLength(final Node<Integer> head) {
		if (head.next == null) {
			return 0;
		}
		return 1 + recurssiveLength(head.next);
	}

}
