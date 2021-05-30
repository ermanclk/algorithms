package org.example;// you can also use imports, for Example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class GreatestPath {
    public static String solution(int[][] A) {

        String path="";
        int[][]  totals= new int[A.length][A[0].length];
        totals[0][0]=A[0][0];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0;j< A[0].length; j++) {
                int max=0;
                if (i > 0) {
                    max = A[i][j] +totals[i-1][j];
                }
                if (j > 0 && max < A[i][j] +totals[i][j-1]) {
                    max = A[i][j] +totals[i][j-1];
                }
                if (totals[i][j] < max) {
                    totals[i][j] = max;
                }
            }
        }
        String res = getLargest(totals,A.length-1,A[0].length-1,"");
        return res;
    }

    public static String getLargest(int T[][],int i, int j,String s) {


        if (i == 0 && j>0) {
            s= T[i][j]-T[i][j-1] + s;
            s =  getLargest(T, i , j-1,s);
        }else if (j == 0 && i>0) {
            s= T[i][j]-T[i-1][j] + s;
            s =  getLargest(T, i -1, j,s);

        } else if (i == 0 && j == 0) {
            return T[i][j]+s;
        }else if (T[i][j-1]< T[i-1][j]) {
            s= T[i][j]-T[i-1][j] + s;
            s =  getLargest(T, i - 1, j,s);
        }else{
            s= T[i][j]-T[i][j-1] + s;
            s =   getLargest(T, i, j-1,s);
        }
        return s;
    }


    public static void main(String[] args) {

        System.out.println(solution(new int[][]{
                {1,2,3,4},
                {1,2,3,5},
                {1,2,3,6}}));
    }
}
