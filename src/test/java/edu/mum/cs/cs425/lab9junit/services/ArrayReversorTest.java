package edu.mum.cs.cs425.lab9junit.services;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
    private ArrayReversor arrayReversorService;
    private IArrayFlattener arrayFlattenerService = mock(IArrayFlattener.class);
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
        when(arrayFlattenerService.flattenArray(a)).thenReturn(null);
//        Integer[] actual = this.arrayReversorService.reverseArray(a);
        int[] actual = this.arrayReversorService.reverseArray(a);
        assertNull(actual);
        verify(arrayFlattenerService).flattenArray(null);
    }

    @Test
    public void reverseArray_Not_Null_Test() {

        int[][] a = new int[][]{{1,3},{0},{4,5,9}};
        when(arrayFlattenerService.flattenArray(a)).thenReturn(new int[]{1,3,0,4,5,9});
        int[] array = arrayFlattenerService.flattenArray(a);
        assertArrayEquals(array, new int[]{1,3,0,4,5,9});
        int[] expected = new int[]{9,5,4,0,3,1};
        int[] actual = arrayReversorService.reverseArray(a);
        assertArrayEquals(actual, expected);
        verify(arrayFlattenerService).flattenArray(new int[][]{{1,3}, {0}, {4,5,9}});
    }
}