package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {


    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {
        int maxArea = h[0];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < h.length; i++) {

            int popCounter=0;
            while (!stack.isEmpty() && h[i] < h[stack.peek()]) {
                popCounter++;
                if (maxArea < popCounter * h[stack.peek()]) {
                    maxArea = popCounter * h[stack.peek()];
                }
                stack.pop();
            }
            stack.push(i);
        }

        int popCounter =1;
        while(!stack.isEmpty()){
            if (maxArea < popCounter * h[stack.peek()]) {
                maxArea = popCounter * h[stack.peek()];
            }
            popCounter++;
            stack.pop();
        }

        return maxArea;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void tester(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
