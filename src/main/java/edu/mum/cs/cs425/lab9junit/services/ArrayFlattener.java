package edu.mum.cs.cs425.lab9junit.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {//implements IArrayFlattener{
//    @Override
    public int[] flattenArray(int[][] a_in){
        if(a_in == null || a_in.length == 0) return null;
        return Arrays.stream(a_in)
                .flatMapToInt(Arrays::stream)
                .toArray();
//        List<Integer> aList = new ArrayList<>();
//        for (int[] ints : a_in) {
//            for (int anInt : ints) {
//                aList.add(anInt);
//            }
//        }
//        Integer[] a_result = new Integer[aList.size()];
//        return aList.toArray(a_result);
    }
}
