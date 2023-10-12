package com.example.jast.exMy.MapVSFlatMap;

import java.util.List;

public class MainEx {
	public static void main(String[] args) {
		List<List<String>> input = List.of(List.of("Mario", "Sofia"), List.of("Luca", "Anna"));
		Ex4 ex1 = new Ex4();

		List<String> output = ex1.extractInitial(input);
		System.out.println("Imperativo:  " + output);
		System.out.println(" ");
		System.out.println("Funzionale:");
		output = ex1.extractInitials(input);
		System.out.println("Prima esecuzione:  " + output);
		System.out.println(" ");
		output = ex1.extractInitials1(input);
		System.out.println("Seconda esecuzione:  " + output);
		System.out.println(" ");
		// output = ex1.extractInitials3(input);
		System.out.println("Terza esecuzione:  " + output);

	}
}
