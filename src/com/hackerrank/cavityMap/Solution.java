package com.hackerrank.cavityMap;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] map = new int[n][n];
		int[][] cavityMap = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			String line = sc.next();
			for (int j = 0; j < n; j++) {
					map[i][j] = line.charAt(j)-'0';
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0 || j==0 || i == n-1 || j == n-1)
					cavityMap[i][j] = map[i][j];
				else {
					int above = map[i-1][j];
					int below = map[i+1][j];
					int left  = map[i][j-1];
					int right = map[i][j+1];
					int cur = map[i][j];
					if (cur > above &&
							cur > below &&
							cur > left &&
							cur > right)
						cavityMap[i][j] = -1;
					else
						cavityMap[i][j] = map[i][j];
				}
			}
			
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(cavityMap[i][j] > -1 ? cavityMap[i][j] : "X");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
