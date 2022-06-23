package com.revature.colby;

// Junit imports
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import com.revature.ds.List;

public class TangArrayListTest {

    @Test
    public void testAdd() {
        List arrayList = new TangArrayList(new Integer[]{1,2,3});
        arrayList.add(4);
        assertEquals(4, arrayList.get(3));

        TangArrayList tangArrayList = (TangArrayList) arrayList;
        assertEquals (4, tangArrayList.getSize());
    }

    @Test
    public void testDelete() {
        List arrayList = new TangArrayList(new Integer[]{1,2,3});
        assertEquals(2, arrayList.delete(1));
        assertEquals(1, arrayList.delete(0));

        TangArrayList tangArrayList = (TangArrayList) arrayList;
        assertEquals (1, tangArrayList.getSize());
        assertEquals(3, tangArrayList.delete(0));
        assertEquals (0, tangArrayList.getSize());

        assertEquals(null, tangArrayList.delete(0));
    }

    @Test
    public void testAddDelete () {
        List arrayList = new TangArrayList(new Integer[]{1,2,3});
        arrayList.add(4);
        assertEquals(4, arrayList.get(3));

        TangArrayList tangArrayList = (TangArrayList) arrayList;
        assertEquals (4, tangArrayList.getSize());

        assertEquals(2, tangArrayList.delete(1));
        assertEquals(1, tangArrayList.delete(0));

        assertEquals (2, tangArrayList.getSize());
    }

    @Test
    public void testGet() {
        List arrayList = new TangArrayList(new Integer[]{1,2,3});
        assertEquals(1, arrayList.get(0));
        assertEquals(2, arrayList.get(1));
        assertEquals(3, arrayList.get(2));

        // Input validation
        assertEquals (null, arrayList.get(-1));
        assertEquals (null, arrayList.get(100));
    }

    @Test
    public void testGetSize() {
        List arrayList = new TangArrayList(new Integer[]{1,2,3});
        TangArrayList tangArrayList = (TangArrayList) arrayList;
        assertEquals (3, tangArrayList.getSize());
    }

    @Test
    public void testIndexOf() {
        List arrayList = new TangArrayList(new Integer[]{1,2,3});
        assertEquals (1, arrayList.indexOf(2));

        // Can't find value
        assertEquals (-1, arrayList.indexOf(200));
    }

    @Test
    public void testIsEmpty() {
        List arrayList = new TangArrayList();
        TangArrayList tangArrayList = (TangArrayList) arrayList;
        assertTrue (tangArrayList.isEmpty());
        tangArrayList.add(4);
        assertFalse(tangArrayList.isEmpty());
    }
}
