package com.hackerrank.flippingTheMatrix;

import java.util.Scanner;

public class Solution {

	public static int maxOfFour(int i1, int i2, int i3, int i4) {
		return Math.max(Math.max(i1, i2), Math.max(i3, i4));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();

		while (q-->0) {
			int n = sc.nextInt();
			int[][] arr = new int[2*n][2*n];
			for (int i = 0; i < 2*n; i++) 
				for (int j = 0; j < 2*n; j++) 
					arr[i][j] = sc.nextInt();
	
			long sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sum += maxOfFour(arr[i][j], 
							arr[i][2*n-1-j],
							arr[2*n-1-i][j],
							arr[2*n-1-i][2*n-1-j]);
				}
			}
			System.out.println(sum);
		}
		
		sc.close();
	}

}
