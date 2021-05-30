package org.example;

import java.util.*;

/**
 * completed,working
 */
class ArrayFormation {

    public static boolean canFormArray(int[] arr, int[][] pieces) {

        Map<Integer,int[]> pieceMap = new HashMap<>();
        for (int[] piece : pieces) {
            pieceMap.put(piece[0],piece);
        }
        for (int i=0;i< arr.length;i++) {
            int[] value=  pieceMap.get(arr[i]);
            if(value == null){
                return false;
            } else {
                if(value.length >1) {
                    for (int k = 1; k < value.length; k++) {
                        if (value[k] == arr[i+1]) {
                            i++;
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr =new int[] {1,2,3};
        int[][] pieces = new int[][] {{1},{3,2}};

        System.out.println(canFormArray(arr,pieces));
    }
}