package com.example.jast.exMy.Expom2;

import java.util.List;
import java.util.Optional;

public class InizialeA {
	public static String extractInitials2(List<String> input) {

		return input.stream().filter(s -> s.charAt(0) == 'A').findFirst().orElse("N/A");

	}

	public static Optional<String> extractInitialsopt(List<String> input) {

		return input.stream().filter(s -> s.charAt(0) == 'A').findFirst();

	}

}
