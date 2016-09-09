package com.hackerrank.aORb;
import java.util.Scanner;


public class Solution {
	public static void printArray(char[] a) {
		boolean leading = true;
		boolean printed = false;
		for (char c : a) {
			if (c == '0' && leading) {}
			else {
				if (leading)
					leading = false;
				if ('a' <= c && c <= 'z')
					c-= 'a'-'A';
				System.out.print(c);
				printed=true;
			}
		}
		if (!printed)
			System.out.print("0");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		while (Q-->0) {
			int K = sc.nextInt();
			String A = sc.next();
			String B = sc.next();
			String C = sc.next();
			int changeCount = 0;
			char[] resultA = new char[A.length()];
			char[] resultB = new char[A.length()];
			for (int i = 0; i < C.length(); i++){
				byte a = Byte.parseByte(A.substring(i,i+1),16);
				byte b = Byte.parseByte(B.substring(i,i+1),16);
				byte c = Byte.parseByte(C.substring(i,i+1),16);
				
				for (byte j = 1; j < 9; j<<=1) {
					if ( (c&j) == j) {	// c's current bit is 1
						if ((a&j) == 0 && (b&j) ==0) {
							b = (byte)(b | j);
							changeCount++;
						}
					}
					else { //c&j ==0;
						if ((a&j) == j) {
							a = (byte)(a & ~j);
							changeCount++;
						}
						if ((b&j) == j) {
							b = (byte)(b & ~j);
							changeCount++;
						}
					}
				}
				resultA[i] = Integer.toString(a,16).toCharArray()[0];
				resultB[i] = Integer.toString(b,16).toCharArray()[0];

			}
			if (changeCount > K) {
				System.out.println("-1");
			}
			else if (changeCount == K) {
				printArray(resultA);
				printArray(resultB);
			}
			else {
				K -= changeCount;
				for (int i = 0; i < resultA.length && K > 0; i++) {
					for (byte j = 8; j > 0 && K > 0; j/=2) {
						byte a = Byte.parseByte(Character.toString(resultA[i]),16);
						byte b = Byte.parseByte(Character.toString(resultB[i]),16);
						byte c = Byte.parseByte(C.substring(i,i+1),16);
						if ((a&b&c&j) == j && K >=1) {
							a = (byte)(a & ~j);
							resultA[i] = Integer.toString(a,16).toCharArray()[0];
							K--;
						}
						else if ((c&j) == j && (a&j)==j && K >= 2) {
							a = (byte)(a & ~j);
							resultA[i] = Integer.toString(a,16).toCharArray()[0];
							
							b = (byte)(b | j);
							resultB[i] = Integer.toString(b,16).toCharArray()[0];

							K--;K--;
						}
					}
				}
				printArray(resultA);
				printArray(resultB);
			}
	
		}
		sc.close();
	}
}