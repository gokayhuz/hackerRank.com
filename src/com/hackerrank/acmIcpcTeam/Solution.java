package com.hackerrank.acmIcpcTeam;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] topics = new String[N];
		for (int i = 0; i < N; i++) 
			topics[i] = sc.next();
		
		int maxScore = 0;
		int maxScoreCount = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				int curScore = 0;
				for (int k = 0; k < M; k++) {
					if (((topics[i].charAt(k)-'0') | (topics[j].charAt(k)-'0')) == 1)
						curScore++;
				}
				if (curScore > maxScore) {
					maxScore = curScore;
					maxScoreCount = 1;
				}
				else if (curScore == maxScore)
					maxScoreCount++;
			}
		}
		System.out.println(maxScore + "\n" + maxScoreCount );
	}

}
