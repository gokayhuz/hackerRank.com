package com.hackerrank.countingSort3;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] counts = new int[100];
		for (int i = 0; i < 100; i++)
			counts[i] = 0;
			
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			String s = sc.next();
			counts[num]++;
		}
		int num = counts[0];
		System.out.print(num + " ");
		for (int i = 1; i < 100; i++) {
			num += counts[i];
			System.out.print(num + " ");
		}
		sc.close();
	}
}
