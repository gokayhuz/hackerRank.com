package com.hackerrank.jimAndTheOrders;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Integer, TreeSet<Integer>> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int d = sc.nextInt();
			if (map.containsKey(d+t)) {
				map.get(d+t).add(i);
			}
			else {
				TreeSet<Integer> set = new TreeSet<>();
				set.add(i);
				map.put(d+t, set);
			}
		}
		for (Integer i : map.keySet()) {
			TreeSet<Integer> ts = map.get(i);
			for (Integer j : ts) {
				System.out.print(j+1 + " ");
			}
		}
		
	}
}
