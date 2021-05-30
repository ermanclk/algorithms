package org.example;

/* Java program for Merge Sort */
class MergeSort 
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {

        int[] temp1 =new int[m-l];
        for(int i = l; i< m; i++){
            temp1[i]=arr[i];
        }

        int[] temp2 =new int[r-m];
        for(int i = m; i< r; i++){
            temp2[i]=arr[i];
        }


    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {

        int m= r+l/2;

        sort(arr,l,m);
        sort(arr,m,r);

        merge(arr,l,m,r);
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }
}