package com.hackerrank.missingNumbers;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// read A
		int n = sc.nextInt();
		int[] n_arr = new int[n];
		for (int i = 0; i < n; i++) {
			n_arr[i] = sc.nextInt();
		}
		
		// read B and get minimum number
		int m = sc.nextInt();
		int[] m_arr = new int[m];
		int minNum = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			m_arr[i] = sc.nextInt();
			if (m_arr[i] < minNum)
				minNum = m_arr[i];
		}

		// increments counts in A
		int[] counts = new int[101];
		for (int i = 0; i < n; i++) {
			counts[n_arr[i]-minNum]++;
		}

		// decrements counts in B		
		for (int i = 0; i < m; i++) {
			counts[m_arr[i]-minNum]--;
		}
		
		for (int i = 0; i < 101; i++) {
			if (counts[i] != 0)
				System.out.print(i+minNum + " ");
		}
		
		sc.close();
	}

}
