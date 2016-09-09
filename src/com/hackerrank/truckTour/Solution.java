package com.hackerrank.truckTour;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] surplus = new int[N];
		for (int i = 0; i < N; i++) {
			int petrol = sc.nextInt();
			int dist = sc.nextInt();
			surplus[i] = petrol-dist;
		}
		
		int numPumps = 0;
		int curSurplus = surplus[0];
		int pumpIndex = 0;
		int startPumpIndex = 0;
		
		while (numPumps < N) {
			if (curSurplus < 0) {
				while (surplus[pumpIndex] < 0)
					pumpIndex++;
				startPumpIndex = pumpIndex;
				curSurplus = surplus[pumpIndex];
				numPumps=1;
			}
			
			pumpIndex = (pumpIndex + 1) % N;
			curSurplus += surplus[pumpIndex];
			

			
			numPumps++;
		}
		System.out.println(startPumpIndex);
	}
}	
