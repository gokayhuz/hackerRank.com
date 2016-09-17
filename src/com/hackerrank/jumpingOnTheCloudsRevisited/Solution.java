package com.hackerrank.jumpingOnTheCloudsRevisited;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int E = 100;
		
		int[] clouds = new int[n];
		
		for (int i = 0; i < n; i++) 
			clouds[i] = sc.nextInt();
		
		int curCloud = 0;
		while (true) {
			curCloud = (curCloud+k) % n;
			E -= 1;
			if (clouds[curCloud] == 1) {
				E -= 2;			// thunder cloud
			}
			if (curCloud == 0) {
				break;
			}
		}
		System.out.println(E);
		sc.close();
	}
}
