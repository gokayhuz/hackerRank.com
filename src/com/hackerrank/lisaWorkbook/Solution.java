package com.hackerrank.lisaWorkbook;

import java.util.Scanner;

public class Solution {

    public static int pageNum(int curPage, int quesNum, int quesPerPage) {
        int pageNum = curPage + (quesNum-1)/quesPerPage;
        return pageNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        int curPage = 1;
        int numSpecialPages = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= t[i]; j++) {
                int pageNum = pageNum(curPage, j, k);
                if (pageNum == j) {
                    numSpecialPages++;
                }
            }
            curPage += (int)Math.ceil(1.0*t[i] / k);
        }
        System.out.println(numSpecialPages);
    }
}
