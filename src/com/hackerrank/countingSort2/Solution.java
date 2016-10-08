package com.hackerrank.countingSort2;

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
			counts[num]++;
		}
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < counts[i]; j++) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}

}
