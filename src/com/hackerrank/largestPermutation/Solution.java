package com.hackerrank.largestPermutation;

import java.util.Scanner;


public class Solution {

	public static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		int[] indices = new int[N];
		// build the input array and the PQ
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			indices[arr[i]-1] = i;
		}
		
		for (int i = 0; i < K && i < N; i++) {
			int oldNum = arr[i];
			int oldIndex = indices[N-1-i];
			swap(arr, i, oldIndex);
			if (i == oldIndex) {
				K++;
			}
			indices[N-1-i] = i;
			indices[oldNum-1] = oldIndex; 
		}

		for (int i = 0; i < N; i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
		sc.close();
	}
}