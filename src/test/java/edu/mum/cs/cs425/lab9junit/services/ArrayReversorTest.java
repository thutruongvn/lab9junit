package edu.mum.cs.cs425.lab9junit.services;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArrayReversorTest {
    private ArrayReversor arrayReversorService;
    private ArrayFlattener arrayFlattenerService = mock(ArrayFlattener.class);
//    @Mock
    @Before
    public void setUp() throws Exception {
        arrayReversorService = new ArrayReversor();
    }

    @After
    public void tearDown() throws Exception {
        arrayReversorService = null;
    }

    @Test
    public void reverseArray_Null_Test() {
        int[][] a = null;
        Integer[] actual = this.arrayReversorService.reverseArray(a);
        assertNull(actual);
    }

    @Test
    public void reverseArray_Not_Null_Test() {

        int[][] a = new int[][]{{1,3},{0},{4,5,9}};
        when(arrayFlattenerService.flattenArray(a)).thenReturn(new int[]{1,3,0,4,5,9});
        int[] array = arrayFlattenerService.flattenArray(a);
        assertArrayEquals(array, new int[]{1,3,0,4,5,9});
        Integer[] expected = new Integer[]{9,5,4,0,3,1};
        Integer[] actual = arrayReversorService.reverseArray(a);
        assertArrayEquals(actual, expected);
    }
}