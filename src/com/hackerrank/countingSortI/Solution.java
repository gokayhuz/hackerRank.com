package com.hackerrank.countingSortI;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[100];
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			A[n]++;
		}
		for (int i=0; i<N; i++) {
			System.out.print(A[i] + " ");
		}
	}

}
