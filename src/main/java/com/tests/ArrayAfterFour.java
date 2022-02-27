package com.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Arrays;


public class ArrayAfterFour {
	private static final Logger logger = LogManager.getLogger(ArrayAfterFour.class.getName());

	public static int[] getArrayAfterFour(int[] arg) {

		try {
			int lastIndex = -1;
			for (int i = arg.length - 1; i >= 0; i--) {
				if (arg[i] == 4) {
					lastIndex = i + 1;
					return Arrays.copyOfRange(arg, lastIndex, arg.length);
				}
			}

			throw new RuntimeException(" в массиве значение не соответствует заданным условиям");

		} catch (RuntimeException e) {
//			logger.info(e.getMessage(), e);
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		int[] arr = {1, 5, 6, 0, 4, 11, 2, 3, 7};
		int[] arr1 = {1, 5, 6, 0, 7, 11, 2, 3, 7};
		int[] arr2 = {1, 5, 6, 0, 4, 11, 4, 3, 7};
		System.out.println(java.util.Arrays.toString(getArrayAfterFour(arr1)));

	}
}
