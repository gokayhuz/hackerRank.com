package com.hackerrank.permutingTwoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		
		while (q-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] A = new int[n];
			int[] B = new int[n];
			for (int i = 0; i<n; i++)
				A[i] = sc.nextInt();
			for (int i = 0; i<n; i++)
				B[i] = sc.nextInt();
			Arrays.sort(A);
			Arrays.sort(B);
			boolean possible = true;
			for (int i = 0; i < (n+1)/2 && possible; i++) {
				if (A[i] + B[n-1-i] < k)
					possible = false;
			}
			if (possible)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}

}
