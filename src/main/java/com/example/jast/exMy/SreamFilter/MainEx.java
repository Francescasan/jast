package com.example.jast.exMy.SreamFilter;

import java.util.List;

public class MainEx {
	public static void main(String[] args) {
		List<String> input = List.of("Mario", "Sofia", "Luca", "Anna");
		Ex ex1 = new Ex();

		List<String> output = ex1.extractInitial(input);
		System.out.println("Imperativo:  " + output);
		System.out.println(" ");
		System.out.println("Funzionale:");
		output = ex1.extractInitials(input);
		System.out.println("Prima esecuzione:  " + output);
		System.out.println(" ");
		output = ex1.extractInitials2(input);
		System.out.println("Seconda esecuzione:  " + output);
		System.out.println(" ");
		output = ex1.extractInitials3(input);
		System.out.println("Terza esecuzione:  " + output);

	}
}
