package org.example;// you can also use imports, for Example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class SmallestPositiveSum {



    public int solution(int[] A) {
        // write your code in Java SE 8

        Set<Integer> numbers = new HashSet<>();
        for (int i : A) {
            if (i > 0) {
                numbers.add(i);
            }
        }
        for (int i = 1; i < numbers.size(); i++) {
            if(!numbers.contains(i)){
                return i;
            }
        }
        return numbers.size()+1;
    }
}
