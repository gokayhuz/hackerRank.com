package com.hackerrank.theFullCountingSort;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] counts = new int[100];
		int[] nums = new int[n];
		
		for (int i = 0; i < 100; i++) {
			counts[i] = 0;
		}
		
		String[] strings = new String[n];
		for (int i = 0; i < n/2; i++) {
			nums[i] = sc.nextInt();
			strings[i] = sc.next();
			strings[i] = "-";
			counts[nums[i]]++;
		}
		for (int i = n/2; i < n; i++) {
			nums[i] = sc.nextInt();
			strings[i] = sc.next();
			counts[nums[i]]++;
		}
		
		int[] startIndices = new int[100];
		startIndices[0] = 0;
		for (int i = 1; i < 100; i++) {
			startIndices[i] = startIndices[i-1] + counts[i-1];
		}
		
		String[] sortedStrings = new String[n];
		for (int i = 0; i < n; i++) {
			String curString = strings[i];
			sortedStrings[startIndices[nums[i]]] = curString;
			startIndices[nums[i]]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(sortedStrings[i] + " ");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
