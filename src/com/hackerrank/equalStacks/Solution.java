package com.hackerrank.equalStacks;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int[] q1 = new int[n1];
		int[] q2 = new int[n2];
		int[] q3 = new int[n3];
		int[] sums1 = new int[n1];
		int[] sums2 = new int[n2];
		int[] sums3 = new int[n3];
		
		// read the arrays
		for (int i = 0; i < n1; i++) {
			q1[i] = sc.nextInt();
		}
		for (int i = 0; i < n2; i++) {
			q2[i] = sc.nextInt();
		}
		for (int i = 0; i < n3; i++) {
			q3[i] = sc.nextInt();
		}
		sums1[n1-1] = q1[n1-1];
		sums2[n2-1] = q2[n2-1];
		sums3[n3-1] = q3[n3-1];
		
		// calculate cumulative sums
		for (int i = n1-2; i >= 0; i--) {
			sums1[i] = sums1[i+1] + q1[i];
		}
		for (int i = n2-2; i >= 0; i--) {
			sums2[i] = sums2[i+1] + q2[i];
		}
		for (int i = n3-2; i >= 0; i--) {
			sums3[i] = sums3[i+1] + q3[i];
		}
		int i1=0, i2=0, i3=0;
		while (i1<n1 && i2<n2 && i3<n3 && (sums1[i1] != sums2[i2] || sums2[i2] != sums3[i3])) {
			if (sums1[i1] >= sums2[i2] && sums1[i1] >= sums3[i3]) {
				i1++;
			}
			else if (sums2[i2] >= sums1[i1] && sums2[i2] >= sums3[i3]) {
				i2++;
			}
			else {
				i3++;
			}
		}
		if (i1==n1 || i2==n2 || i3==n3)
			System.out.println("0");
		else
			System.out.println(sums1[i1]);
	}
}
