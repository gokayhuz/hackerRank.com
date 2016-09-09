package com.hackerrank.beautifulBinaryString;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String B = sc.next();
		int count = 0;
		int l = B.length();
		char[] s = B.toCharArray();
		for (int i = 0; i < l; i++) {
			if (s[i] == '0') {
				if (i+1 < l && s[i+1] == '1') {
					if (i+2 < l && s[i+2] == '0') {
						s[i+2] = 1;
						count++;
					}
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
