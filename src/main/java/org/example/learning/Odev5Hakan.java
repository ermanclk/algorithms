package org.example.learning;

public class Odev5Hakan {

    public static void main(String[] args) {

        int[] integerArray = {123, 43, 123, 66, 434, 11, 234, 77, 554};
        int[] newIntegerArray = new int[integerArray.length];
        boolean flag = true;
        int removeValue = 123;
        int i;
        for (i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == removeValue) {
                flag = false;
                continue;
            }
            else {
                if (!flag) {
                    newIntegerArray[i-1] = integerArray[i];
                    System.out.println(newIntegerArray[i-1]);
                } else {
                    newIntegerArray[i] = integerArray[i];
                    System.out.println(newIntegerArray[i]);
                }
            }
        }
    }
}
