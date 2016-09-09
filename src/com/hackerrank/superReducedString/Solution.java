package com.hackerrank.superReducedString;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static String reduceString(String s) {
		Stack<Character> stack = new Stack<>();
		char[] strArray = s.toCharArray();
		int l = strArray.length;
		stack.push(strArray[0]);
		for (int i = 1; i < l; i++) {
			if (stack.isEmpty())
				stack.push(strArray[i]);
			else if (stack.peek() == strArray[i]) {
				stack.pop();
			}
			else {
				stack.push(strArray[i]);
			}
		}
		int i = 0;
		char[] result = new char[stack.size()];
		while (!stack.isEmpty()) {
			result[i++] = stack.pop();
		}
		
		
		/*int c = result.length;
		for (int j = 0; j < c/2; j++) {
			char tmp = result[j];
			result[j] = result[c-1-j];
			result[c-1-j] = tmp;
		}*/
		StringBuilder sb = new StringBuilder();
		
		for (char ch : result) 
			sb.append(ch);
		sb.reverse();
		String resString = sb.toString();
		if (resString.length()==0)
			return "Empty String";
		else
			return resString;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(reduceString(s));
	}

}
