package com.hackerrank.connectedCellsInAGrid;

import java.util.Scanner;

public class Solution {

	public static int visit(int[][] mtrx, boolean[][] visited, int n, int m, int i, int j) {
		if (i >= n || j >= m || i < 0 || j < 0 || visited[i][j] || mtrx[i][j]==0)
			return 0;
		int count = 0;
		visited[i][j] = true; count++;
		count += visit(mtrx, visited, n, m, i-1, j-1); // upper left cell
		count += visit(mtrx, visited, n, m, i-1, j);   // upper cell
		count += visit(mtrx, visited, n, m, i-1, j+1); // upper right cell
		count += visit(mtrx, visited, n, m, i, j-1);   // left cell
		count += visit(mtrx, visited, n, m, i, j+1);   // right cell
		count += visit(mtrx, visited, n, m, i+1, j-1); // lower left
		count += visit(mtrx, visited, n, m, i+1, j);   // lower
		count += visit(mtrx, visited, n, m, i+1, j+1); // lower right
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mtrx = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		
		// read input
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				mtrx[i][j] = sc.nextInt();
				visited[i][j] = false;
			}
		
		// DPS on the matrix
		int largestRegion = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				if (!visited[i][j]) {
					int size = visit(mtrx, visited, n, m, i, j);
					if (size > largestRegion)
						largestRegion = size;
				}
			}
		System.out.println(largestRegion);
		sc.close();
	}
}
