package com.datastructures;

public class Main {

	public static void main(String[] args) {

		Student anishPaul = new Student("anish", "Paul", 1);
		Student ironMan = new Student("iron", "man", 2);
		Student batMan = new Student("bat", "man", 3);

		StudentLinkedList linkedList = new StudentLinkedList();
		linkedList.addFront(anishPaul);
		linkedList.addFront(ironMan);

		linkedList.addFront(batMan);

		linkedList.printList();
		System.out.println(linkedList.getSize());
	
		linkedList.removeFromFront();
		System.out.println(linkedList.getSize());
		linkedList.printList();
	}
}
