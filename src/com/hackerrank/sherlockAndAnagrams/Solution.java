package com.hackerrank.sherlockAndAnagrams;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while (T-->0) {
			String s = sc.next();

			int result = 0;
			HashMap<String, Integer> map = new HashMap<>();
					
			for (int i = 1; i <= s.length(); i++) {  	  // length of subString
				for (int j = 0; j < s.length()-i+1; j++) {  // starting position
					char[] subString = s.substring(j,j+i).toCharArray();
					Arrays.sort(subString);
					String sorted = new String(subString);

					if (!map.containsKey(sorted)) {
						map.put(sorted,1);
					}
					else {
						map.put(sorted, map.get(sorted)+1);;
					}
				}	
			}
			for (String key : map.keySet()) {
				int count = map.get(key);
				result += count*(count-1)/2;
			}
			System.out.println(result);
		}
		sc.close();
	}
}
