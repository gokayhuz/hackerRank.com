package com.hackerrank.matchingSets;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static long sum(int[] a) {
		long sum = 0;
		for (int i : a)
			sum += i;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++)
			x[i] = sc.nextInt();
		for(int i = 0; i < n; i++)
			y[i] = sc.nextInt();

		Arrays.sort(x);
		Arrays.sort(y);
		
		long less = 0, more = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] < y[i]) {
				less += (y[i] - x[i]);
			}
			if (x[i] > y[i]) {
				more += (x[i] - y[i]);
			}
		}
		
		if (less == more) {
			System.out.println(more);
		}
		else {
			System.out.println(-1);
		}
	}

}
