package com.revature.helloworld.ds;

public class AbreuArrayList implements List {
	Object arr[];
	int size;
	int capacity;
	
	public AbreuArrayList(){ // array list constructor creates an arrList with intial capacity of 10
		capacity = 10;
		size = 0;
		arr = new Object[capacity];
	}

	@Override
	public void add(Object obj) {
		arr[size++] = obj;
	}
	
	@Override
	public Object get(int index) {
		return arr[index];
	}
	
	public int size() {
		return size;
	}

	@Override
	public Object delete(int index) { // removes the element at the specified index
//		if (index == 0) {
//			System.out.println("Already Empty!");
//			return ;
//		}
		return null;
	}

	@Override
	public int indexOf(Object obj) {
		if (obj == null) {
			for (int i = 0; i < size; i++) 
				if(arr[i] == null)
					return i;
		} else {
			for(int i = 0; i < size; i++)
				if(obj.equals(arr[i]))
					return i;
	
		}
		return -1;
	}
	
}
