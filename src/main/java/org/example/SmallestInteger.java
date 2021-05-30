package org.example;

import java.util.HashSet;
import java.util.Set;

class SmallestInteger {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            numbers.add(A[i]);
        }
        int smallest=0;
        for (int i =1;i<numbers.size()+1;i++) {

            if (!numbers.contains(i)) {
                smallest=i;
                break;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        solution(new int[]{1,3,6,4,1,2});
    }
}
