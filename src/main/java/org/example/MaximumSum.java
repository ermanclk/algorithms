package org.example;

//https://www.hackerrank.com/challenges/max-array-sum/problem?h_l=interview&playlist_slugs
// %5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dynamic-programming
public class MaximumSum {

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {

        int maxSum=0;
        int[] dArray=new int[arr.length];
        if (arr[0] > 0) {
            dArray[0]= arr[0];
        }

        for (int i=0;i< arr.length; i++) {
            dArray[0]= arr[0];
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] array= {9,2,7,3,5};

        int res = maxSubsetSum(array);

    }

}
