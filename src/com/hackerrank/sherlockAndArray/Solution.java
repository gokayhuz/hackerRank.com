package com.hackerrank.sherlockAndArray;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-->0) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			for (int i = 0; i < N; i++) { 
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			int partialSum = 0;
			boolean complete = false;
			for (int i = 1; i < N && !complete; i++) {
				partialSum += arr[i-1];
				int leftSide = partialSum;
				int rightSide = sum-arr[i]-partialSum;
				if (leftSide == rightSide) {
					complete = true;
					System.out.println("YES");
				}
			}
			if (N==1) {
				System.out.println("YES");
				complete=true;
			}
			if (!complete) 
				System.out.println("NO");
		}
		sc.close();
	}
}
