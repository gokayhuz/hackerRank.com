package com.hackerrank.sherlockAndTheBeast;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-->0) {
			int N = sc.nextInt();
			boolean decent = false;
			for (int numOfFives = N; numOfFives>=0 && !decent; numOfFives--) {
				int numOfThrees = N-numOfFives;
				if (numOfFives%3 == 0 && numOfThrees%5 == 0) {
					decent = true;
					for (int i = 0; i < numOfFives; i++)
						System.out.print("5");
					for (int i = 0; i < numOfThrees; i++) 
						System.out.print("3");
					System.out.println();;
					break;
				}
			}
			if (!decent)
				System.out.println("-1");
		}
        sc.close();
	}

}
