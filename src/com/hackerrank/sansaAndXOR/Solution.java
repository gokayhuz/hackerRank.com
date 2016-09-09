package com.hackerrank.sansaAndXOR;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-->0) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			if (N%2 == 0)
				System.out.println("0");
			else {
				int result = 0;
				for (int i = 0; i < N; i=i+2) {
					result ^= arr[i];
				}
				System.out.println(result);
			}
		}
	}
}
