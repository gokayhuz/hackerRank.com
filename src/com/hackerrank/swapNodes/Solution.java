package com.hackerrank.swapNodes;

import java.util.Scanner;

public class Solution {

	public static void swap(int[] a, int[] b, int index) {
		int tmp = a[index];
		a[index] = b[index];
		b[index] = tmp;
	}
	
	public static void inOrderPrint(int index, int[] left, int[] right) {
		if (left[index] != -1)
			inOrderPrint(left[index], left, right);
		System.out.print(index + " ");
		if (right[index] != -1)
			inOrderPrint(right[index], left, right);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] leftChildren = new int[1025];
		int[] rightChildren = new int[1025];
		int[] depth = new int[1025];
		int maxDepth = 0;
		
		depth[1] = 1;
		
		for (int i = 1; i <= N; i++) {
			leftChildren[i] = sc.nextInt();
			rightChildren[i] = sc.nextInt();
			if (leftChildren[i] != -1) {
				depth[leftChildren[i]] = depth[i] + 1;
				if (maxDepth < depth[i] + 1)
					maxDepth = depth[i] + 1;
			}
			if (rightChildren[i] != -1) {
				depth[rightChildren[i]] = depth[i] + 1;
				if (maxDepth < depth[i] + 1)
					maxDepth = depth[i] + 1;
			}
		}
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int K = sc.nextInt();
			int curDepth = K;
			while (curDepth < maxDepth) {
//				inOrderPrint(1, leftChildren, rightChildren);
//				System.out.println();
				for (int d = 0; d < N; d++) {
					if (depth[d] == curDepth)
						swap(leftChildren, rightChildren, d);						
				}
				curDepth+=K;
			}
			inOrderPrint(1, leftChildren, rightChildren);
			System.out.println();
		}
		
		sc.close();
	}
}