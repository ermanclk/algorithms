package org.example;

import java.io.*;
import java.util.*;

public class SpecialString {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        String sub;
        int counter=0;
        for (int i = 1; i < s.length()+1; i++) {
            sub= s.substring(0,i);
            for(int k=0;k<sub.length();k++){
                if(isSpecial(sub.substring(k))){
                    counter++;
                }
            }
        }
        return counter;
    }

     static boolean isSymetric(String s){
        boolean result = false;
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            result= isSymetric( s.substring(1,s.length() - 1));
        }
        return result;
    }

    static boolean isSpecial(String s){
        boolean result = false;
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.length()%2==1) {
            s=s.replaceFirst(s.substring(0,(s.length()/2)+1),s.substring(0,(s.length()/2)));
        }
        Set<Character> values = new HashSet();
        for (Character c : s.toCharArray()) {
            values.add(c);
        }
        if(values.size()!=1){
            return false;
        }
        return true;
    }
    static long substrCount1(String s)
    {
        long retVal = s.length();

        for (int i = 0; i < s.length(); i++)
        {
            Character startChar = s.charAt(i);
            int diffCharIdx = -1;
            for (int j = i + 1; j < s.length(); j++)
            {
                Character currChar = s.charAt(j);
                if (startChar == currChar)
                {
                    if ((diffCharIdx == -1) ||
                            (j - diffCharIdx) == (diffCharIdx - i))
                        retVal++;
                }
                else
                {
                    if (diffCharIdx == -1)
                        diffCharIdx = j;
                    else
                        break;
                }
            }
        }
        return retVal;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        long result = substrCount1( "abab");
        System.out.println(result);
    }
}