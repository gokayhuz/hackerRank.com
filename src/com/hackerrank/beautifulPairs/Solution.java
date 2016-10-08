package com.hackerrank.beautifulPairs;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> counts = new HashMap<>();
		
		// put array A in a HashMap
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (counts.containsKey(a)) {
				counts.put(a, counts.get(a)+1);
			}
			else
				counts.put(a, 1);
		}
		
		int numBeautifulPairs = 0;
		
		// iterate through array B and check for matches
		for (int i = 0; i < N; i++) {
			int b = sc.nextInt();
			if (counts.containsKey(b)) {
				numBeautifulPairs++;
				int count = counts.get(b);
				if (count == 1)
					counts.remove(b);
				else
					counts.put(b, count-1);
			}
		}
		
		if (counts.size() == 0)
			numBeautifulPairs--;
		else
			numBeautifulPairs++;
		
		System.out.println(numBeautifulPairs);
		sc.close();
	}

}
