package com.hackerrank.iceCreamParlor;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] c_arr = new int[n];
			for (int i = 0; i < n; i++) {
				int c = sc.nextInt();
				if (!map.containsKey(m-c)) {
					map.put(c, i+1);
				}
				else {
					System.out.println(map.get(m-c) + " " + (i+1));
				}
			}
		}
		sc.close();
	}
}
