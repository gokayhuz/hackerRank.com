package com.hackerrank.cipher;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		byte[] cipherText = new byte[N+K-1];
		byte[] plainText = new byte[N];
		String cipherTextStr = sc.next();
		
		for (int i = 0; i < N+K-1; i++) {
			cipherText[i] = (byte)(cipherTextStr.charAt(i)-'0');
		}
		
		plainText[0] = cipherText[0];		
		for (int i = 1; i < N; i++) {
			
			if (i-K >= 0)
				plainText[i] = (byte)(cipherText[i] ^ cipherText[i-1] ^ plainText[i-K]);
			else
				plainText[i] = (byte)(cipherText[i] ^ cipherText[i-1]);
		}
		
		
		for (int i = 0; i < N; i++) {
			System.out.print(plainText[i]);
		}
		sc.close();
	}

}
