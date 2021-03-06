package com.kyson.chapter1.section4;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;

/***
 * 1.4.8
 * 编写一个程序,计算输入文件中相等的整数对的数量.如果你的第一个程序是平方级别的,请继续思考并以Array.sort()给出一个线性对数级别的解答
 * 
 * 1.4.8 Write a program to determine the number pairs of values in an input
 * file that are equal. If your first try is quadratic, think again and use
 * Arrays.sort() to develop a linearithmic solution.
 *
 */

public class TwoSameFast {
	public static int twoSameFast(long[] a){
		int cnt = 0;
		for (int i = 0; i < a.length - 1; i++) 
		{
			if (a[i] == a[i+1]) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		String filePathString = System.getProperty("user.dir");
		String intFileString = filePathString
				+ "/src/com/kyson/chapter1/section4/" + "1kints.txt";

		In in = new In(intFileString);
		long[] a = in.readAllLongs();
		Arrays.sort(a);
		System.out.println("相同的整数的数量为" + twoSameFast(a));
	}
}
