package com.revature.lists.colby;

import java.util.Arrays;

import com.revature.lists.ds.List;

public class TangArrayList implements List {

    private Object[] arr;
    private int size;

    public ArrayList () {
        arr = new Object[1];
    }

    // creating an array list with an array
    public ArrayList (Object[] newArr) {
        arr = newArr;

        // Calculate the actual number of elements in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                size += 1;
            }
        } 
    }

    public int getSize () {
        return size;
    }

    @Override
    public void add(Object obj) {
        arr[size] = obj;
        size += 1;
        if (size > arr.length - 1) {
            arr = Arrays.copyOf (arr, size * 2);
        }
    }

    @Override
    public Object delete(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(Object obj) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
