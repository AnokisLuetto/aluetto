package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Counter.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/

public class CounterTest {
	/**
	 * Test Counter div by 2, with first and finish value.
	*/
	@Test
	public void calcSummEvenNumbers() {
    	Counter cnt = new Counter();
    	int result = cnt.add(1, 10);
    	assertThat(result, is(30));
	}
}
