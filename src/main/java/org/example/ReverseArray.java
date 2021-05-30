package org.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {

    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c','d'};
        reverseString(s);
        for (char c : s) {
            System.out.println(c);

        }
    }
    public static void reverseString(char[] s) {

        reverse(s,0);
    }

    public static void reverse(char[] s, int index) {

        if(index == s.length/2){
            return;
        }
        char temp = s[index];
        s[index]= s[s.length-index-1];
        s[s.length-index-1]=temp;
        reverse(s,index+1);
    }

}