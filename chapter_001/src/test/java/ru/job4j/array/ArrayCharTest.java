package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for ArrayChar.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class ArrayCharTest {
	/**
	 * Test complete array char.
	*/
	@Test
	public void whenStartWithPrefixThenTrue() {
		ArrayChar word = new ArrayChar("Hello");
		boolean result = word.srartWith("He");
		assertThat(result, is(true));
	}
	/**
	 * Test NOTcomplete array char.
	*/
	@Test
	public void whenNotStartWithPrefixThenFalse() {
		ArrayChar word = new ArrayChar("Hello");
		boolean result = word.srartWith("Hi");
		assertThat(result, is(false));
	}
}
