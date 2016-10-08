package com.hackerrank.quickSortInPlace;

import java.util.Scanner;

public class Solution {

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
        		swap(ar, i, j++);
        	}
        }
        swap(ar, end-1, j);
        return j;
    }  
    
    static int quickSort(int[] ar, int left, int right) {
    	if (right-left <= 1)
    		return 0;
    	int pivotPos = partition(ar, left, right);
    	printArray(ar);
    	quickSort(ar, left, pivotPos);
    	quickSort(ar, pivotPos+1, right);
    	return 0;
    }
    
    static void printArray(int[] ar) {
        for(int n: ar)
            System.out.print(n+" ");
        System.out.println();
    }
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt(); 
        }
        quickSort(ar, 0 , n);
        sc.close();
	}
}
