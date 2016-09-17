package com.hackerrank.quickSort1Partition;

import java.util.*;
public class Solution {
       
    static void swap(int[] a, int l, int r) {
        int tmp = a[l];
        a[l] = a[r];
        a[r] = tmp;
    }
    
    static void partition(int[] ar) {
        int pivot = ar[0];
        int l = 1;
        int r = ar.length-1;
        while (l <= r) {
            while (ar[l] < pivot && l <= r)
                l++;
            while (ar[r] > pivot && r >= l)
                r--;
            if (l < r)
                swap (ar, l, r);
        }
        swap(ar, 0, r);
        printArray(ar);
    }   
 
    static void printArray(int[] ar) {
        for(int n: ar)
            System.out.print(n+" ");
        System.out.println();
    }
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt(); 
        }
        partition(ar);
    }    
}
