package org.example;

import java.util.*;
import java.util.LinkedList;

/**
 * working but must be enhanced
 */
class MinWindow {
    public static String minWindow(String s, String t) {

        Set<Character> set = new HashSet<>();

        for (char c : t.toCharArray()) {
            set.add(c);
        }
        int minWindowSize = s.length();
        String minWindow = "";
        Deque<Character> window = new LinkedList<>();

        for (int i = 0; i < s.toCharArray().length; i++) {
            Character ch = s.charAt(i);
            if (window.size() != 0 || window.size() == 0 && set.contains(ch)) {
                window.offer(ch);
            }

            if (set.contains(ch)) {
                set.remove(ch);
            }
            if (window.peek() == ch) {
                Character nextChar = window.remove();
                while (t.indexOf(nextChar) == -1 || window.contains(nextChar)) {
                    nextChar= window.remove();
                }
                if (!window.contains(nextChar)) {
                    window.addFirst(nextChar);
                }
            }
            if (set.size() == 0) {
                if (minWindowSize > window.size()) {
                    minWindowSize = window.size();
                    minWindow = window.toString();
                }
                set.add(window.remove());
                if (window.size() > 0) {

                    Character nextChar = window.remove();

                while (t.indexOf(nextChar) == -1 || window.contains(nextChar)) {
                    nextChar= window.remove();
                }
                if (!window.contains(nextChar)) {
                    window.addFirst(nextChar);
                }
            }
            }
        }
        return minWindow.replace(",","").replace("[","").replace("]","").replace(" ","");
    }


    public static void main(String[] args) {

        System.out.println(minWindow("ADOBECODEBANC", "ABC"));

    }
}
