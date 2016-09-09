package com.hackerrank.waiter;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Solution {

	public static int[] getPrimes(int N) {
		boolean[] isPrime = new boolean[N+1];
		for (int i = 0; i < N+1; i++) {
			isPrime[i] = true;
		}
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		for (int i = 2; i <= (int)(Math.sqrt(N+1)); i++) {
			for (int curIndex = 2*i; curIndex < N+1; curIndex=curIndex+i) {
				isPrime[curIndex] = false;
			}
		}
		ArrayList<Integer> primeList = new ArrayList<>();
		for (int i = 0; i < N+1; i++) {
			if (isPrime[i])
				primeList.add(i);
		}
		int[] result = new int[primeList.size()];
		for (int i = 0; i < primeList.size();i++) {
			result[i] = primeList.get(i); 
		}
		return result;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		Stack<Integer> nums = new Stack<>();
		for (int i = 0; i < N; i++) 
			nums.push(sc.nextInt());
		
		int[] primes = getPrimes(10000);
		for (int q = 0; q < Q; q++) {
			int curPrime = primes[q];
			Stack<Integer> remainStack = new Stack<>();
			Stack<Integer> divisibleStack = new Stack<>();
			while (!nums.isEmpty()) {
				int top = nums.peek();
				if (top % curPrime == 0) {
					divisibleStack.push(nums.pop());
				}
				else {
					remainStack.push(nums.pop());
				}
			}
			while (!divisibleStack.isEmpty()) {
				System.out.println(divisibleStack.pop());
			}
			nums = remainStack;
		}
		while (!nums.isEmpty()) {
			System.out.println(nums.pop());
		}
	}
}
