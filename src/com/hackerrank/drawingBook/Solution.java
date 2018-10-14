package com.hackerrank.drawingBook;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();

        int front = p / 2;
        int back = (n) / 2 - (p)/2;

        System.out.println(front < back ? front : back);
    }
}
