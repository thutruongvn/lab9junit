package edu.mum.cs.cs425.lab9junit.services;

public class ArrayReversor {

    private IArrayFlattener flattenerService;

    public void ArrayReversor(IArrayFlattener flattenerService) {
        this.setFlattenerService(flattenerService);
    }
    public int[] reverseArray(int[][] a_in){
        int[] f_a = this.flattenerService.flattenArray(a_in);
        if(f_a == null) return null;
        int[] r_a = new int[f_a.length];
        for(int i = 0; i< r_a.length; i++) {
            r_a[i] = f_a[f_a.length -1 -i];
        }
        return r_a;
//        if(a_in == null || a_in.length == 0) return null;
//        List<Integer> aList = new ArrayList<>();
//        for (int[] ints : a_in) {
//            for (int anInt : ints) {
//                aList.add(0,anInt);
//            }
//        }
//        Integer[] a_result = new Integer[aList.size()];
//        return aList.toArray(a_result);
//        return null;
    }

    public void setFlattenerService(IArrayFlattener flattenerService) {
        this.flattenerService = flattenerService;
    }
}
