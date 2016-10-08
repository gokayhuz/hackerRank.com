package com.hackerrank.runningTimeOfQuickSort;

import java.util.Scanner;

public class Solution {

	static int qSortSwapCount = 0;
	static int insertionSortSwapCount = 0;
	
	 static void swap(int[] a, int l, int r) {
        int tmp = a[l];
        a[l] = a[r];
        a[r] = tmp;
    }
	 static int partition(int[] ar, int start, int end) {
        if (end<=start)
        	return start;  
        int pivot = ar[end-1];
        int j = start;
        for (int i = start; i < end; i++) {
        	if (ar[i] < pivot) {
        		qSortSwapCount++;
        		swap(ar, i, j++);
        	}
        }
        qSortSwapCount++;
        swap(ar, end-1, j);
        return j;
    }  
	    
    static void quickSort(int[] ar, int left, int right) {
    	if (right-left <= 1)
    		return;
    	int pivotPos = partition(ar, left, right);
    	quickSort(ar, left, pivotPos);
    	quickSort(ar, pivotPos+1, right);
    }
	    
    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j--];
                insertionSortSwapCount++;
            }
            A[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i=0; i < n; i++){
            arr[i]  = in.nextInt();
            arr2[i] = arr[i];
        }
        insertionSort(arr);
        quickSort(arr2, 0, arr.length);
        System.out.println(insertionSortSwapCount-qSortSwapCount);
    }

}
