package com.example.jast.exMy.Ex3;

import java.util.Arrays;

public class MainMedia {
	public static double extractInitials(Persona[] input) {

		return Arrays.stream(input).filter(s -> s.getEta() > 17).mapToDouble(s -> s.getEta()).average().orElse(0);

	}

	public static int valoreMin(int[] input) {

		return Arrays.stream(input).filter(s -> s % 2 != 0).min().orElse(0);

	}
}
