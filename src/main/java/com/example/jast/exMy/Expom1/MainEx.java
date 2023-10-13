package com.example.jast.exMy.Expom1;

import java.util.Arrays;

public class MainEx {

	public static int imperative(int[] input) {
		int result = 0;

		for (int s : input) {
			result = result + (s * s);

		}

		return result;
	}

	public static int functional(int[] input) {

		return Arrays.stream(input).map(s -> s = s * s).sum();
	}

	public static int[] functionalArray(int[] input) {

		return Arrays.stream(input).map(s -> s = s * s).toArray();
	}

}
