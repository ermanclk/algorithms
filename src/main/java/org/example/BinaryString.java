package org.example;

import java.util.HashMap;
import java.util.Map;

public class BinaryString {

    Map<Character, Integer> cache = new HashMap<>();
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        char[] s= Integer.valueOf(n).toBinaryString(n).toCharArray();
        Integer cached = cache.get(s);
        if (cached != null) {
            return cached;
        }
        int counter=0;
        for (Character c : s) {
            if (c == '1') {
                counter++;
            }
        }
        return counter;
    }
}