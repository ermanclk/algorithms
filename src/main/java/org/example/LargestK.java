package org.example;

import java.util.*;

class LargestK {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> numbers = new HashMap();
        int max = 0;
        for (Integer i : A) {
            if (numbers.get(i) == null && numbers.get(-i)==null) {
                numbers.put(Math.abs(i), 0);
            }else{
                Integer val = numbers.get(Math.abs(i));
                if (max < val) {
                    max=val;
                }
            }

        }
        return max;
    }


}
