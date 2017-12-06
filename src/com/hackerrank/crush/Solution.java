package com.hackerrank.crush;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long[] array = new long[n+2];
		for (int i = 0; i < n; i++) {
			array[i] = 0;
		}

		for(int a0 = 0; a0 < m; a0++){
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			array[a] += k;
			array[b+1] -= k;
		}

		long max = 0L;
        long currentSum = 0L;
		for (int i = 0; i <= n; i++) {
		    currentSum += array[i];
		    if (currentSum > max)
		        max = currentSum;
		}

		System.out.println(max);
		in.close();
	}
}
