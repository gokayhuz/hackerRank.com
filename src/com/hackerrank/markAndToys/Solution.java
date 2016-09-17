package com.hackerrank.markAndToys;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		int[] prices = new int[N];
		for (int i = 0; i < N; i++)
			prices[i] = sc.nextInt();
		Arrays.sort(prices);
		
		int numToys = 0;
		long curCost = 0;
		while (curCost+prices[numToys] < K) {
			curCost += prices[numToys++];
		}

		System.out.println(numToys);
		sc.close();
	}

}
