package com.hackerrank.Pairs;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		HashSet<Integer> map = new HashSet<>();
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			int curInt = sc.nextInt();
			if (map.contains(curInt-K)) {
				count++;
			}
			if (map.contains(curInt+K)) {
				count++;
			}
			map.add(curInt);
		}
		System.out.println(count);
		sc.close();
	}

}
