package com.kyson.chapter1.section1;

/**
 * http://www.jianshu.com/p/396eb81f7d4c
 * 
 * 1.1.28 删除重复元素。修改BinarySearch类中的测试用例来删去排序之后白名单中的所有重复元素。
 * 
 */


import java.util.Arrays;

public class DumplicateElements {

	public static void main(String[] args) {
		int[] N = {1,2,2,3,4,5,6,6,7,8,9};
		System.out.println("original array:"+ N.toString());
		int[] resultArray = searchDumplicateElements(N);
		System.out.println("result array:"+ resultArray.toString());
		
		Arrays.toString(N);
	}
	
	public static  int[]  searchDumplicateElements (int[] array) {
		
		int[] tempArray = new int[array.length];
		int sameNumTime = 0;
		for(int i = 0 ; i < array.length ; i ++){
			if (i == array.length - 1) {
				break;
			}
		
			if (array[i] == array[i + 1]) {
				tempArray[sameNumTime] = array[i];
				sameNumTime ++ ;
			}
		}
		
		int[] resultArray = new int[sameNumTime];
		for(int j = 0 ; j < sameNumTime ; j ++)
			resultArray[j] = tempArray[j];
		
		
		return resultArray;
	}
	
	
}
