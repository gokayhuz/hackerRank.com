package com.hackerrank.richieRich;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// num of digits
		int k = sc.nextInt();	// num of changes
		String num = sc.next();
		char[] numArr = num.toCharArray();
		int numChanges = 0;
		boolean[] changed = new boolean[n];
		
		// convert the num to a palindrome
		for (int i = 0; i < n/2;i++) {
			if (numArr[i] != numArr[n-1-i]) {
				char tmp = numArr[i] > numArr[n-1-i] ? numArr[i] : numArr[n-1-i];
				numArr[i] = tmp;
				numArr[n-1-i] = tmp;
				numChanges++;
				changed[i] = true;
				changed[n-1-i] = true;
			}
		}
		if (numChanges > k)  {
			System.out.println("-1");
			System.exit(0);
		}
		// make the number bigger
		for (int i = 0; numChanges < k && i <= n/2; i++) {
			if (k-numChanges > 1 && numArr[i] != '9') {
				numArr[i] = 9+'0';
				numArr[n-1-i] = 9+'0';
				if (changed[i]) {
					numChanges++;
				}
				else
					numChanges += 2;
			}
			else if (k-numChanges == 1 && numArr[i] != '9' && (changed[i] || i*2+1 == n)) {
				numArr[i] = 9+'0';
				numArr[n-1-i] = 9+'0';
				numChanges++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(numArr[i]);
		}
		sc.close();
	}

}
