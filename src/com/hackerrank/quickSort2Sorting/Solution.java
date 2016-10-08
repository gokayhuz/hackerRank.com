package com.hackerrank.quickSort2Sorting;

import java.util.*;

public class Solution {
       
    static int partition(int[] ar, int start, int end) {
        if (end<=start)
        	return start;  
        int[] result = new int[end-start];
        int pivot = ar[start];
        int curIndex = 0;
        for (int i = start; i < end; i++) {
        	if (ar[i] < pivot)
				result[curIndex++] = ar[i];
        }
        int pivotIndex = start+curIndex;
        result[curIndex++] = pivot;
        
        for (int i = start; i < end; i++) {
    		if (pivot < ar[i])
    			result[curIndex++] = ar[i];
        }
        
        for (int i = 0; i < end-start; i++) {
        	ar[start+i] = result[i];
        }
        return pivotIndex;
    }   
 
    static int quickSort(int[] ar, int left, int right) {
    	if (right-left <= 1)
    		return 0;
    	int pivotPos = partition(ar, left, right);
    	quickSort(ar, left, pivotPos);
    	quickSort(ar, pivotPos+1, right);
    	printArray(ar, left, right);
    	
    	return 0;
    }
    
    static void printArray(int[] ar, int s, int e) {
        for(int i = s; i < e; i++)
            System.out.print(ar[i] + " ");
        System.out.println();
    }
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i]=in.nextInt(); 
        }
        quickSort(ar, 0, n);
        in.close();
    }    
}
