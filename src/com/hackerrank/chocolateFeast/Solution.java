package com.hackerrank.chocolateFeast;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt(); 
		
			int numWrappers = n / c;
			int totalNumChocs = numWrappers;
			
			while (numWrappers / m > 0) {
				totalNumChocs += numWrappers/m;
				numWrappers = numWrappers/m + numWrappers%m;
			}
			
			System.out.println(totalNumChocs);
		}
		
		sc.close();
	}

}
