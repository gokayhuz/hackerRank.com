package com.hackerrank.bonAppetit;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int total = 0;
        int costk = 0;
        for (int i = 0; i < n; i++) {
            int cost = sc.nextInt();
            total += cost;
            if (i==k) {
                costk = cost;
            }
        }
        int bActual = (total - costk)/2;
        int bCharged = sc.nextInt();

        if (bActual == bCharged) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println((int)(bCharged - bActual));
        }
    }
}
