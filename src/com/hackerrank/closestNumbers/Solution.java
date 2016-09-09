package com.hackerrank.closestNumbers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for (int i = 0; i < N; i++) 
			A[i] = sc.nextInt();
		
		Arrays.sort(A);
		int minDiff = Integer.MAX_VALUE;
		ArrayList<Integer> pairs = new ArrayList<>();

		for (int i = 1; i < N; i++) {
			int curDiff = Math.abs(A[i]-A[i-1]);
			if (curDiff < minDiff) {
				minDiff = curDiff;
				pairs = new ArrayList<>();
				pairs.add(A[i]);
				pairs.add(A[i-1]);
			}
			else if (curDiff == minDiff) {
				pairs.add(A[i]);
				pairs.add(A[i-1]);
			}
			
		}		
		
		Collections.sort(pairs);
		for (int i : pairs)
			System.out.print(i + " ");
	}

}
