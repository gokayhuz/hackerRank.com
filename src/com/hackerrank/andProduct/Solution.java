/**
 * https://www.hackerrank.com/challenges/and-product/problem
 *
 * Solution by Gokay Huz <gokayhuz@gmail.com>>
 *
 */
package com.hackerrank.andProduct;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		long mask = 1;

		while ((mask<<1) > 0) {
			mask <<= 1;

		}
		long MSB = mask;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
		    boolean hasStarted = false;
			long a = sc.nextLong();
			long b = sc.nextLong();
			long result = 0;
			mask = MSB;
			while (mask > 0) {
                if (hasStarted && ((a & mask) > 0 ^ ((b & mask) > 0))) {
                    break;
                }

				if ((a & mask) > 0 && ((b & mask) > 0)) {
				    hasStarted = true;
					result = result | mask;
				}
				mask >>= 1;
			}

			System.out.println(result);
		}
	}

}
