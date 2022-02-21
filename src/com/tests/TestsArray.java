package com.tests;

import java.util.Arrays;

public class TestsArray {
	private static int[] getArrayAfterFour(int... arg) {

		try {
			int lastIndex = -1;
			for (int i = 0; i < arg.length; i++) {
				if (arg[i] == 4) {
					lastIndex = i + 1;
					return Arrays.copyOfRange(arg, lastIndex, arg.length);
				}
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return arg;
	}

	public static void main(String[] args) {
		int[] arr = {1, 5, 6, 0, 4, 11, 2, 3, 7};
		int[] arr1 = {1, 5, 6, 0, 7, 11, 2, 3, 7};
		System.out.println(Arrays.toString(getArrayAfterFour(arr1)));

	}
}
