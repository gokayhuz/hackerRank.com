package com.hackerrank.serviceLane;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] width = new int[N];
		for (int i = 0; i < N; i++) {
			width[i] = sc.nextInt();
		}
		while (T-->0) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int minWidth = 4;
			for (int k = i; k <= j; k++) {
				if (width[k] < minWidth)
					minWidth = width[k];
			}
			System.out.println(minWidth);
		}
	}
}
