package org.example;

import java.util.*;

/**
 * Completed, Working
 *
 *
 */
class DaysOfWeek {

    public static Integer solution(String S, int K,int newParam) {

        return null;
    }


    public static String solution(String S, int K) {
        /**
         * Arraylist :
         */

        Map<String, Integer> daysOfWeek = new HashMap<>();
        daysOfWeek.put("Mon", 0);
        daysOfWeek.put("Tue", 1);
        daysOfWeek.put("Wed", 2);
        daysOfWeek.put("Thu", 3);
        daysOfWeek.put("Fri", 4);
        daysOfWeek.put("Sat", 5);
        daysOfWeek.put("Sun", 6);

        int indexS = daysOfWeek.get(S);

        int remaining = (indexS + K) % 7;
        String result = "";
        for (Map.Entry<String, Integer> entry : daysOfWeek.entrySet()) {
            if (entry.getValue() == remaining) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final String result = solution("Wed", 33333 );
        System.out.println(result);
    }
}
