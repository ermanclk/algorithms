package org.example.learning;

public class Odev1Hakan {

    public static void main(String[] args) {

        int[] array = new int[]{123, 43, 123, 66, 434, 11, 234, 77, 554};

        int average = 0;
        int total = 0;
        int i;

        for(int sayi : array)
        {
            total = sayi + total;
        }

        for(i=1; i<= array.length; i++)
        {
            average = total / i;
        }
        System.out.println("Average: " + average);
    }
}
