package org.example;// you can also use imports, for Example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

/**
 * completed,working
 */
class BinaryGap {

    public int solution(int N) {
        // write your code in Java SE 8
        String bin = Integer.toBinaryString(N);
        boolean startGap=false;
        int counter=0;
        int max=0;
        for (char c : bin.toCharArray()) {
            if(c=='1'){
                startGap=true;
                if (max < counter) {
                    max=counter;
                }
                counter=0;
            }
            if(c=='0' && startGap){
                counter++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
  //"already working!!!";
    }
}
