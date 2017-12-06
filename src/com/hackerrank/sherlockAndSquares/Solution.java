package com.hackerrank.sherlockAndSquares;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int low = (int)Math.ceil(Math.sqrt(A));
            int high = (int)Math.floor(Math.sqrt(B));
            System.out.println(high-low+1);
        }
    }
}
