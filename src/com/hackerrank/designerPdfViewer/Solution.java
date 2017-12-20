package com.hackerrank.designerPdfViewer;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int l = word.length();

        int max = 0;
        for (char c : word.toCharArray()) {
            if (h[c-'a'] > max) {
                max = h[c-'a'];
            }
        }
        System.out.println(max * l);
    }
}
