package org.example.learning;

public class Odev2Hakan {

    public static void main(String[] args) {

        int[] intArray = {123, 43, 161, 434, 11, 234, 77, 554};
        boolean sort = true;
        while (sort) {
            sort = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] <= intArray[i + 1]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                    sort = true;
                }
            }
        }
        for(int number: intArray){
            System.out.println(number);
        }
    }
}