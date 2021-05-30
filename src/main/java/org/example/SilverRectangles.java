package org.example;

import java.util.HashMap;
import java.util.Map;

class SilverRectangles {
    public int solution(int[] A, int[] B) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0; i< A.length; i++) {
            Integer elementA = map.get(A[i]);
            Integer elementB = map.get(B[i]);

            if (elementA != null) {
                map.put(A[i],++elementA);
            }else{
                map.put(A[i],1);
            }

            if (elementB != null && elementA != elementB) {
                map.put(B[i],++elementB);
            }else{
                map.put(B[i],1);
            }
        }

        int max= 1;
        for (Integer value : map.values()) {
            if (max < value) {
                max=value;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        SilverRectangles s= new SilverRectangles();
        int solution = s.solution(new int[]{2, 3, 2, 3, 5}, new int[]{3, 4, 2, 4, 2});
        System.out.println(solution);
    }
}
