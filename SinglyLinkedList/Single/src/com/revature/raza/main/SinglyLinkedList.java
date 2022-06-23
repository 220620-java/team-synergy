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
		if(this.head == null) {
			System.out.println("empty list");
			return null;
		}
		else {
			
			Node current = head;
			int counter = 1;
			while(current.nextNode != null) {
				if(index == counter) {
					current = current.nextNode;
					break;
				}
				current = current.nextNode;
				counter++;
			}
			return current.data;
		}	
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
