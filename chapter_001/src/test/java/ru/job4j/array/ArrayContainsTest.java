package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Array Contains.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class ArrayContainsTest {
	/**
	 * Test complete string array contain string.
	*/
	@Test
	public void whenStringContainStringThenTrue() {
		ArrayContains word = new ArrayContains();
		boolean result = word.contains("Privet", "ive");
		assertThat(result, is(true));
	}
	/**
	 * Test complete string array contain string.
	*/
	@Test
	public void whenStringContainStringThenFalse() {
		ArrayContains word = new ArrayContains();
		boolean result = word.contains("Hello", "el1");
		assertThat(result, is(false));
	}
}
