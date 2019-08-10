package edu.mum.cs.cs425.lab9junit.services;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener;
    @Before
    public void setUp() throws Exception {
        this.arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown() throws Exception {
        this.arrayFlattener = null;
    }

    @Test
    public void flattenArray_Null_Test() {
        int[][] a = null;
        int[] actual = this.arrayFlattener.flattenArray(a);
        assertNull(actual);
    }
    @Test
    public void flattenArray_Not_Null_Test() {
        int[][] a = new int[][]{{1,3},{0},{4,5,9}};
        int[] expected = new int[]{1,3,0,4,5,9};
        int[] actual = this.arrayFlattener.flattenArray(a);
        assertArrayEquals(expected,actual);
    }
}