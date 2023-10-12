package com.example.jast.exMy.MapVSFlatMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ex4 {
	public List<String> extractInitial(List<List<String>> input) {
		List<String> result = new ArrayList<>();
		for (List<String> StrinList : input) {
			for (String s : StrinList) {

				String initial = "%s.".formatted(s.charAt(0));
				result.add(initial);

			}
		}
		return result;
	}

	public List<String> extractInitials(List<List<String>> input) {
		return input.stream().flatMap(listNe -> listNe.stream()).map(s -> "%s.".formatted(s.charAt(0))).toList();
	}

	public List<String> extractInitials1(List<List<String>> input) {
		return input.stream().flatMap(Collection::stream).map(s -> "%s.".formatted(s.charAt(0))).toList();
	}

}
