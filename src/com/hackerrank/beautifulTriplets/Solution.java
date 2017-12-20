package com.hackerrank.beautifulTriplets;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int index1 = 0; index1 < n; index1++) {
            int index2, index3;
            if ((index2 = indexOf(arr, index1+1, arr[index1]+d)) != -1
                && (indexOf(arr, index2+1, arr[index2] + d) != -1)) {

                count++;
            }
        }

        System.out.println(count);
    }

    private static int indexOf(int[] arr, int startIndex, int num) {
        for (int i = startIndex; i < arr.length && arr[i] <= num; i++) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }
}
