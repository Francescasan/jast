package com.example.jast.exMy.Expom2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class InizialeATest {

	@Test
	void test() {
		List<String> input = List.of("francesca", "rocco");
		String expected = "Asono";
		String parola = InizialeA.extractInitials2(input);
		assertEquals(parola, expected);
	}

}
