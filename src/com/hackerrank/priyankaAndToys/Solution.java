package com.hackerrank.priyankaAndToys;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] weight = new int[N];
		for (int i = 0; i < N; i++) 
			weight[i] = sc.nextInt();
		
		Arrays.sort(weight);
		
		int curIndex = 0;
		int cost = 0;
		while (curIndex < N) {
			int minPrice = weight[curIndex];
			while (curIndex<N && weight[curIndex]<=minPrice+4)
				curIndex++;
			cost++;
		}
		System.out.println(cost);
		sc.close();
	}

}
