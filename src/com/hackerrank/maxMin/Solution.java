package com.hackerrank.maxMin;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i< N; i++) 
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		
		int unfairness = Integer.MAX_VALUE;
		for (int i = 0; i <= N-K; i++) {
			int min = arr[i];
			int max = arr[i+K-1];
			if (max-min < unfairness)
				unfairness = max-min;
		}
		System.out.println(unfairness);
		sc.close();
	}

}
