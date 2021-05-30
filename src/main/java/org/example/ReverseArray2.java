package org.example;

public class ReverseArray2 {

    public static void main(String[] args) {
        char[] arg = {'a', 'b', 'c','d'};

        reverseString(arg);

        for (char c : arg) {
            System.out.println(c);
        }
    }


    public static void reverseString(char[] s) {


        for (int i = 0; i < s.length/2;i++) {

            char temp = s[i];
            s[i]= s[s.length-1-i];
            s[s.length-1-i]= temp;

        }

    }

}