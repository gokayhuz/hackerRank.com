//https://www.hackerrank.com/challenges/cube-summation/problem
//
package com.hackerrank.cubeSummation;

import java.util.Scanner;

public class Solution {

	public static long sum(long[][][] m, int x1, int y1, int z1, int x2, int y2, int z2) {
		long sum = 0;
		for (int x = x1; x <= x2; x++) {
			for (int y = y1; y <= y2; y++) {
				sum += (m[x][y][z2]-m[x][y][z1-1]);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
	    StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-->0) {
        	int N = sc.nextInt();
        	int M = sc.nextInt();
        	long[][][] m = new long[N+1][N+1][N+1];
        	for (int i = 0; i <= N; i++) {
        		for (int j = 0; j <= N; j++) {
					for (int k = 0; k <= N; k++) {
						m[i][j][k] = 0;
					}
				}
			}

			int up = 0;
			while (M --> 0) {
        		String command = sc.next();
        		if (command.charAt(0) == 'U') {
        			int x = sc.nextInt();
        			int y = sc.nextInt();
        			int z = sc.nextInt();
        			int num = sc.nextInt();
        			if (m[x][y][z] == m[x][y][z-1]) {
                        for (int i = z; i <= N; i++) {
                            m[x][y][i] += num;
                        }
                    } else {
        			    long old_delta = m[x][y][z] - m[x][y][z-1];
                        for (int i = z; i <= N; i++) {
                            m[x][y][i] += (num - old_delta);
                        }
                    }

				} else {
        		    up++;
        			int x1 = sc.nextInt();
        			int y1 = sc.nextInt();
        			int z1 = sc.nextInt();
					int x2 = sc.nextInt();
					int y2 = sc.nextInt();
					int z2 = sc.nextInt();
                    long sum = sum(m, x1, y1, z1, x2, y2, z2);
                    sb.append(sum).append("\n");
				}
			}

		}
        System.out.println(sb.toString());
    }
}
