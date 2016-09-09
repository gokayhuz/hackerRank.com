package com.hackerrank.yelp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static HashMap<String, Integer> getColors(String s) {
		HashMap<String, Integer> colorMap = new HashMap<>();
		
		String allTokens[] = s.split(",");
		for (String token : allTokens) {
			int start = token.indexOf('\'');
			int end = token.indexOf('\'', start);
			String color = (token.substring(start,end));
			if (colorMap.containsKey(color))
				colorMap.put(color, colorMap.get(color));
			else 
				colorMap.put(color,1);
		}
		return colorMap;
	}
	public static void print(HashMap<String, Integer> map) {
		int maxCount = 0;
		ArrayList<String> result = new ArrayList<>();
		for (String s : map.keySet())
			if (map.get(s) > maxCount) {
				maxCount = map.get(s);
				result = new ArrayList<>();
				result.add(s);
			}
			else if (map.get(s) == maxCount) {
				result.add(s);
			}
		String[] resultArray = new String[result.size()];
		result.toArray(resultArray);
		Arrays.sort(resultArray);
		for (String s : resultArray)
			System.out.println(s);
	}
	
	public static void main(String[] args) {
		System.out.println("ada");
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNext()) {
			sb.append(sc.next());
		}
		String s = sb.toString();
		print(getColors(s));
		
		sc.close();
	}
}
