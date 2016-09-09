package com.hackerrank.queueUsingTwoStacks;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		for (int i = 0; i<Q; i++) {
			int t = sc.nextInt();
			switch (t) {
			case 1:	//enqueue
				s1.push(sc.nextInt());
				break;
			case 2:	//dequeue
				if (s2.isEmpty()) {
					while (!s1.isEmpty()) {
						s2.push(s1.pop());
					}
				}
				s2.pop();
				break;
			case 3://print
				if (s2.isEmpty()) {
					while (!s1.isEmpty()) {
						s2.push(s1.pop());
					}
				}
				System.out.println(s2.peek());
				break;
			}
		}
	}
}
