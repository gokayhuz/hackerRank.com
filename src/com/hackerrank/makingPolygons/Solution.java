package com.hackerrank.makingPolygons;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static boolean validPolygon(Integer[] a, int n, int sum) {
		if (n < 3)
			return false;
		if (a[0] >= sum-a[0])
			return false;
		else 
			return true;
	}
	/**
	 * 
	 * @param a "descendingly sorted" array of Integers
	 * @param n	length of array
	 */
	public static void splitEdge(Integer[] a, int n) {
		int b = a[0]/2;
		int c = a[0] - b;
		a[0] = b;
		a[n] = c;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n==1) {
        	System.out.println(2);
        	System.exit(0);
        }
        int sum = 0;
        Integer a[] = new Integer[3*n];
        for(int a_i=0; a_i < 3*n; a_i++){
            a[a_i] = 0;
        }
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            sum+=a[a_i];
        }
        
    	Arrays.sort(a, Collections.reverseOrder());  
    	int splits = 0;
        while (!validPolygon(a,n, sum)) {
        	splitEdge(a,n);
        	splits++;
        	n++;
        	Arrays.sort(a, Collections.reverseOrder());
        }
        System.out.println(splits);
    }
}