package stringConstruction;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-->0) {
			String s = sc.next();
			int[] counts = new int[26];
			for (int i = 0; i < 26; i++)
				counts[i] = 0;
			for (int i = 0; i < s.length(); i++) {
				counts[s.charAt(i)-'a'] = 1;
			}
			int result = 0;
			for (int i = 0; i < 26; i++) {
				if (counts[i] > 0)
					result++;
			}
			System.out.println(result);
		}
	}

}
