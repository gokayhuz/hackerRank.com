package com.hackerrank.numberOfSequences;

import java.util.Scanner;

public class Solution {
	
	public static boolean isNiceStart(int[]a, int endIndex) {
		for (int i = 0; i < endIndex; i++) {
			if (!(0 <= a[i] && a[i] <= i)) // first condition
				return false;
			for (int j = i; j < endIndex; j=j+i+1) {
				if (a[j] % i != a[i])
					return false;
			}
		}
		return true;
	}
	
	public static boolean isNiceTillEnd(int[]a, int startIndex) {
		for (int i = startIndex; i < a.length; i++) {
			if (!(0 <= a[i] && a[i] <= i)) // first condition
				return false;
			for (int j = i; j < a.length; j=j+i+1) {
				if (a[j] % i != a[i])
					return false;
			}
		}
		return true;
	}

	
	public static int seq(int[] a, int index, int k, int count)  {
		if (k == a.length) {
			return count+1;
		}
		for (int i = 0; i <= k; i++) {
			a[i] = i;
		//	for (int j = index; )
		}
		
		return 0;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			//if (a[i] == -1) 
			//	count = seq(a, i, count);
		}
		sc.close();
		
	}	

}
