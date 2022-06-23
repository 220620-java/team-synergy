package com.revature.lists.ds;

// interfaces are for setting up a group of behaviors that
// something should have without specifying how those behaviors
// will actually work
// (abstract methods)
public interface List {
	// in interfaces, all methods are abstract implicitly
	// because they're designed for behaviors,
	// fields are implicitly public, static, and final
	// interfaces cannot be instantiated
	// can't do this: List myList = new List();
	public void add (Object obj);
	public Object get (int index);
	public Object delete (int index);
	public int indexOf (Object obj);
	
	// because methods are implicitly abstract, if we
	// want a concrete method, we have to use the "default"
	// keyword because it is a "default" implementation
	public default void printMessage() {
		hello();
	}
	
	// if it's private, you don't need the "default" keyword
	// to make it concrete
	private void hello() {
		System.out.println("hello from List");
	}
	
	// if it's static, you don't need the "default" keyword
	// to make it concrete
	public static List emptyList() {
		// TODO
		return null;
	}
}
