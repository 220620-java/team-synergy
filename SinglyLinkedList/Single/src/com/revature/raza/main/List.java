package com.revature.raza.main; 
// fields are implicitly public static final
// methods are implicitly abstract
public interface List {

	public void add(Object obj);
	public Object get(int index);
	public Object delete(int index); 
	public int indexOf(Object obj); 
	
	
	//concrete methods. If we want 
	public default void show() {
		System.out.println("Hi");
	}
	
	public static List emptyList() {
		//TODO
		return null;
	}
}
