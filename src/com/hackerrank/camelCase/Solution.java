package com.hackerrank.camelCase;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int numWords = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)<='Z' && s.charAt(i) >= 'A')
				numWords++;
		}
		System.out.println(numWords+1);
	}
}
