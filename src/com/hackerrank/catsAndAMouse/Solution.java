package com.hackerrank.catsAndAMouse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-->0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int deltaX = Math.abs(x-z);
            int deltaY = Math.abs(y-z);

            if (deltaX < deltaY)
                System.out.println("Cat A");
            else if (deltaX > deltaY)
                System.out.println("Cat B");
            else
                System.out.println("Mouse C");
        }
    }
}