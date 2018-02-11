package ru.job4j.loop;

import org.junit.Test;
//import java.util.stream.IntStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Factorial.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/

public class FactorialTest {
	/**
	 * Тест, проверяющий, что факториал для числа 5 равен 120.
	*/
	@Test
	public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
    	Factorial fct = new Factorial();
    	int result = fct.calc(5);
    	assertThat(result, is(120));
	}

	/**
	 * Тест, проверяющий, что факториал для числа 0 равен 1.
	*/
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
    	Factorial fct = new Factorial();
    	int result = fct.calc(0);
    	assertThat(result, is(1));
	}
}
