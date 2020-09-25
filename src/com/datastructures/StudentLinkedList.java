package com.datastructures;

public class StudentLinkedList {

	private StudentNode head;
	int size;

	public void addFront(Student student) {
		StudentNode node = new StudentNode(student);
		node.setNext(head);
		head = node;
		size++;
	}

	public void printList() {
		StudentNode current = head;
		System.out.print("HEAD ->");
		while (current != null) {
			System.out.print(current);
			System.out.print(" ->");
			current = current.getNext();
		}
		System.out.println("null");

	}

	public int getSize() {
		return size;
	}

	public StudentNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		StudentNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public boolean isEmpty() {
		return head == null;
	}

}
