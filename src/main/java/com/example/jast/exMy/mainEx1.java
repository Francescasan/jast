package com.example.jast.exMy;

import java.util.List;

public class mainEx1 {
	public static void main(String[] args) {
		List<String> input = List.of("francesca", "rocco");
		Ex1 ex1 = new Ex1();
		// List<String> output = ex1.extractInitials(input);
		List<String> output = ex1.extractInitials(input);
		System.out.println("Prima esecuzione:  " + output);
		System.out.println(" ");
		output = ex1.extractInitials2(input);
		System.out.println("Seconda esecuzione:  " + output);
		System.out.println(" ");
		output = ex1.extractInitials3(input);
		System.out.println("Terza esecuzione:  " + output);

	}
}
