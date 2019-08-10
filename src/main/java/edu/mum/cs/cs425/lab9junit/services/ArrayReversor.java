package edu.mum.cs.cs425.lab9junit.services;

import java.util.ArrayList;
import java.util.List;

public class ArrayReversor {


    public Integer[] reverseArray(int[][] a_in){
        if(a_in == null || a_in.length == 0) return null;
        List<Integer> aList = new ArrayList<>();
        for (int[] ints : a_in) {
            for (int anInt : ints) {
                aList.add(0,anInt);
            }
        }
        Integer[] a_result = new Integer[aList.size()];
        return aList.toArray(a_result);
//        return null;
    }
}
