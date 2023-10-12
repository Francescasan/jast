package com.example.jast.exMy;

import java.util.List;

public class Ex1 {
	// restituisce una lista elementi che sono le inziali degli elementi della lista
	// in input
	public List<String> extractInitials(List<String> input) {
		return input.stream().map(s -> "%s.".formatted(s.charAt(0))).toList();
	}

	// restituisce una lista elementi che sono le inziali degli elementi della lista
	// in input tutte in maiuscolo

	public List<String> extractInitials2(List<String> input) {
		return input.stream().map(s -> {
			String upperUser = s.toUpperCase();
			return "%s.".formatted(upperUser.charAt(0));
		}).toList();
	}

	// come il metodo sopra ma scomposto
	public List<String> extractInitials3(List<String> input) {
		return input.stream().map(s -> getInit(s)).toList();
	}

	private String getInit(String s) {
		String upperUser = s.toUpperCase();
		return "%s.".formatted(upperUser.charAt(0));
	}

}
