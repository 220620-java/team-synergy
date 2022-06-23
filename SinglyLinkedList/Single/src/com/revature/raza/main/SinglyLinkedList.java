package com.revature.raza.main; 

class SinglyLinkedList implements List {
	
	class Node {
		Object data; 
		Node nextNode; 
		
		Node(Object data) {
			this.data = data; 
			nextNode = null; 
		}
	}

	Node head; 
	
	@Override
	//Method to add objects 
	public void add(Object obj) {
		// TODO Auto-generated method stub
		Node node = new Node(obj); 
		
		if (head == null) {
			head = node; 
		} else {
			
			Node current = head; 
			while (current.nextNode != null) {
				current= current.nextNode; 
			}
			current.nextNode = node; 
			head = current; 	
		}
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object delete(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	/* Hello here is a comment I made*/
}