package com.revature.colby;

import java.util.Arrays;

import com.revature.ds.List;

public class TangArrayList implements List {

    private Object[] arr;
    private int size;

    // Empty list
    public TangArrayList () {
        arr = new Object[1];
    }

    // creating an array list with an array
    public TangArrayList (Object[] newArr) {
        arr = newArr;

        // Calculate the actual number of elements in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                size += 1;
            }
        } 
    }

    // get the size of the array
    public int getSize () {
        return size;
    }

    // is the list empty?
    public boolean isEmpty () {
        return size <= 0;
    }

    // Adds the object to the end of the list
    @Override
    public void add(Object obj) {
        if (size > arr.length - 1) {
            arr = Arrays.copyOf (arr, size * 2);
        }
        arr[size] = obj;
        size += 1;
    }

    // Deletes the object at the index
    @Override
    public Object delete(int index) {
        Object deletedObject = arr[index];
        if (index > size || index < 0) {
            System.out.println ("OUT OF RANGE!");
            return null;
        }

        if (isEmpty()) {
            System.out.println ("LIST IS EMPTY! CANNOT DELETE");
            return null;
        }
        
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i+1];
        }
        size -= 1;
        return deletedObject;
    }

    // Retrieves the object at the index
    @Override
    public Object get(int index) {
        if (index > size || index < 0) {
            System.out.println ("OUT OF RANGE!");
            return null;
        }
        return arr[index];
    }

    // Finds the index of the given object
    // Returns -1 if object is not found
    @Override
    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    // Prints the list 
    @Override
    public String toString() {
        String retString = "{";
        for (int i = 0; i < size; i++) {
            retString += arr[i];
            if (i < size - 1) {
                retString += ", ";
            }
        }
        retString += "}";
        return retString;
    }
    
}
