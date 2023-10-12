package com.example.jast.exMy.SreamFilter;

import java.util.ArrayList;
import java.util.List;

public class Ex {
	public List<String> extractInitial(List<String> input) {
		List<String> result = new ArrayList<>();
		for (String s : input) {
			if (s.length() % 2 == 1) {
				String initial = "%s.".formatted(s.charAt(0));
				result.add(initial);
			}
		}
		return result;
	}

	// restituisce una lista elementi che sono le inziali degli elementi della lista
	// in input solo con lunghezza dispari
	public List<String> extractInitials(List<String> input) {
		return input.stream().filter(s -> s.length() % 2 == 1).map(s -> "%s.".formatted(s.charAt(0))).toList();
	}

	// restituisce una lista elementi che sono le inziali degli elementi della lista
	// in input tutte in maiuscolo solo con lunghezza dispari

	public List<String> extractInitials2(List<String> input) {
		return input.stream().filter(s -> s.length() % 2 == 1).map(s -> {
			String upperUser = s.toUpperCase();
			return "%s.".formatted(upperUser.charAt(0));
		}).toList();
	}

	// come il metodo sopra ma scomposto
	public List<String> extractInitials3(List<String> input) {
		return input.stream().filter(s -> s.length() % 2 == 1).map(s -> getInit(s)).toList();
	}

	private String getInit(String s) {
		String upperUser = s.toUpperCase();
		return "%s.".formatted(upperUser.charAt(0));
	}

}
