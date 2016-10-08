package com.hackerrank.luckBalance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		ArrayList<Integer> importantContests = new ArrayList<>();
		ArrayList<Integer> unimportantContests = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int L = sc.nextInt();
			int T = sc.nextInt();
			if (T==1)
				importantContests.add(L);
			else
				unimportantContests.add(L);
		}
		Collections.sort(importantContests);
		
		int luck = 0;
		// lose all the unimportant contests
		for (Integer i : unimportantContests)
			luck += i;
		
		// lose K of the important contests
		int l = importantContests.size();
		for (int i = l-K; i < l; i++) {
			if (i>=0)
				luck += importantContests.get(i);
		}
		
		// win the remaining important contests	
		for (int i = 0; i < l-K; i++) {
			luck -= importantContests.get(i);
		}
		
		System.out.println(luck);
		sc.close();
	}

}
