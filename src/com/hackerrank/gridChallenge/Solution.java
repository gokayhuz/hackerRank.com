package com.hackerrank.gridChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-->0) {
			int N = sc.nextInt();
			char[][] arr = new char[N][N];
			for (int i = 0; i < N; i++) {
				String s = sc.next();
				for (int j = 0; j < N; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
		
			for (int i = 0; i < N; i++) {
				Arrays.sort(arr[i]);
			}
			boolean possible = true;
			for (int i = 1; i < N && possible; i++) {
				for (int j = 0; j < N && possible; j++) {
					if (arr[i][j] < arr[i-1][j])
						possible = false;
				}
				
			}
			if (!possible)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		
		
		sc.close();
	}

}
