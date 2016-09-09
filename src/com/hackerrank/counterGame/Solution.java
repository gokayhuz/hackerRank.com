package com.hackerrank.counterGame;

import java.util.Scanner;

public class Solution {
	
	// returns the number of bits set in the binary representation of a long
	public static int popCount(long a) {
		int count= 0;
		while (a != 0) {
			if ((a & 1) == 1)
				count++;
			a =  a >>> 1;
		}
		return count;
	}
	
	public static boolean isPowerOfTwo(long a) {
		return popCount(a) == 1;
	}

	// uses 1-based indexing
	public static int lowestBitSet(long a) {
		if (a==0)
			return 0;	
		int lowestBitSet = 0;
		int curBit= 1;
		while (lowestBitSet == 0) {
			if ((a & 1) == 1)
				lowestBitSet = curBit;
			curBit++;
			a >>>= 1;
		}
		return lowestBitSet;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		while (T-->0) {
			String s = sc.next();
			Long K = Long.parseUnsignedLong(s);
			int numTurns = popCount(K) - 1 + lowestBitSet(K)-1;
			if ((numTurns % 2) == 1)
				System.out.println("Louise");
			else
				System.out.println("Richard");
		}
		
	}

}
