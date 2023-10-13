package com.example.jast.exMy.Ex3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainMediaTest {
	/*
	 * @Test void test() { Persona[] input = { new Persona("Tom", 10), new
	 * Persona("Bob", 18), new Persona("Kim", 2) }; int expected = 19; double parola
	 * = MainMedia.extractInitials(input);
	 * 
	 * assertEquals(parola, expected);
	 * 
	 * }
	 */

	@Test
	void testMin() {
		int[] input = { 1, 2, 4, 21 };
		int expected = 1;
		int parola = MainMedia.valoreMin(input);

		assertEquals(parola, expected);

	}

	@Test
	void testMinVuoto() {
		int[] input = {};
		int expected = 0;
		int parola = MainMedia.valoreMin(input);

		assertEquals(parola, expected);

	}

	@Test
	void testMinUgualePari() {
		int[] input = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
		int expected = 0;
		int parola = MainMedia.valoreMin(input);

		assertEquals(parola, expected);

	}

	@Test
	void testMinUgualeDispari() {
		int[] input = { -1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int expected = -1;
		int parola = MainMedia.valoreMin(input);

		assertEquals(parola, expected);

	}

}
