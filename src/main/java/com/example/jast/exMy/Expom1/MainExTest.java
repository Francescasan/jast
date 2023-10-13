package com.example.jast.exMy.Expom1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainExTest {

	@Test
	void imperativoSemplice() {
		int[] input = { 1, 2 };
		int expected = 5;
		int extractInitialT = MainEx.imperative(input);
		assertEquals(extractInitialT, expected);

	}

	@Test
	void funzionaleSemplice() {
		int[] input = { 1, 2 };
		int expected = 5;
		int extractInitialT = MainEx.functional(input);
		assertEquals(extractInitialT, expected);

	}

	@Test
	void funzionaleSemplice2() {
		int[] input = { 0, 0 };
		int expected = 0;
		int extractInitialT = MainEx.functional(input);
		assertEquals(extractInitialT, expected);

	}

}
