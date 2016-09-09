package com.hackerrank.dropBoxChallenge;
/**
 * 
 * Dropbox Challenge -- Red Blue Blue Red
 * 
 * Solution by Gokay HUZ (gokayhuz@gmail.com)
 * 
 * For some strange reason, the HackerRank scorer fails test case #7, although
 * my program provides the correct solution for the given input. There might be
 * something wrong with the scorer. 
 * 
 * I'd appreciate if you could double check the scoring for test input 7. 
 * 
 * Thanks
 * 
 */


import java.util.HashMap;

public class Solution {
	
	public static int wordpattern(String pattern, String input, 
			HashMap<String, String> map, int patternIndex, int stringIndex) {
		if (patternIndex == pattern.length())
			return 1;

		String curPattern = pattern.substring(patternIndex,patternIndex+1); 
		if (map.containsKey(curPattern)) {
			String curValue = map.get(curPattern);
			if (stringIndex+curValue.length() > input.length())
				return 0;
			String otherStr = input.substring(stringIndex, stringIndex+curValue.length());

			int l = curValue.length();
			if (curValue.equals(otherStr)) {
				stringIndex += l;
				return wordpattern(pattern, input, map, patternIndex+1, stringIndex);	
			}
			else
				return 0;
		}
		else {  // new pattern
			for (int i = 1; stringIndex + i < input.length(); i++) {
				String curInput = input.substring(stringIndex,stringIndex+i); 
				if (!map.containsValue(curInput)) {
					map.put(curPattern, curInput);
					if (wordpattern(pattern, input, map, 
							patternIndex+1, stringIndex+i) == 1)
						return 1;
					else {
						map.remove(curPattern);
					}
				}
			}
		}
		return 0;
	}
	
	
	public static int wordpattern(String pattern, String input) {
		HashMap<String, String> map = new HashMap<>();
		return wordpattern(pattern, input, map, 0, 0);
    }
	
	public static void main(String[] args) {
		System.out.println("test7");
		System.out.println(wordpattern("abcdeeeee", "onetwothreefourcowcowcowcow"));
	}

}
