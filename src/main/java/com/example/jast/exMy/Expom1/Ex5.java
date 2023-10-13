package com.example.jast.exMy.Expom1;

import java.util.List;

public class Ex5 {
	System.out.println("Benvenuto/a");
	List<Integer> input = List.of(1, 4, 6, 2);
	Ex5 ex1 = new Ex5();

	int output = ex1.extractInitial(input);
	System.out.println("Imperativo:  " + output);
	System.out.println(" ");
	System.out.println("Funzionale:");
	output = ex1.extractInitials(input);
	public int extractInitial(List<Integer> input) {
		int result = 0;

		for (int s : input) {
			result = result + (s * s);

		}

		return result;
	}

	public List<Integer> extractInitial2(List<Integer> input) {
		int r = 0;
		return input.stream().map(s -> r = r + s * s).toList();
	}

}
