package com.hackerrank.cookieParty;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 	// number of guests
        int m = in.nextInt();	// number of cookies
        if (m%n==0)
            System.out.println("0");
        else {
            int numCookies = (int)Math.ceil(m*1.0/n);
            System.out.println(numCookies*n - m);
        }
    }
}
