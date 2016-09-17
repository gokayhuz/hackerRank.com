package com.hackerrank.jumpingOnTheClouds;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] clouds = new int[n];
		
		for (int i = 0; i < n; i++) 
			clouds[i] = sc.nextInt();
		
		int curCloud = 0;
		int numJumps = 0;
		while (curCloud < n-1) {
			if (clouds[curCloud] == 0) {
				numJumps++;
				curCloud += 2;				
			}
			else {
				curCloud += -1;
			}
		}
		System.out.println(numJumps);
	}
}
