package com.hackerrank.fairRations;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int i=0; i < N; i++){
            B[i] = in.nextInt();
        }
        
        int cur = 0;
        int total = 0;
        while (cur++ < N-1) {
        	if (B[cur] % 2 == 1) {
        		total++;
        		B[cur+1]++;
        	}
        }
        if (B[cur] % 2 == 0)
        	System.out.println(2*total);
        else
        	System.out.println("NO");
        in.close();
    }
}
