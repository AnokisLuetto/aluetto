package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Array.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class FindLoopTest {
	/**
	 * Test find element.
	*/
	@Test
	public void whenSuccessfulFindElement() {
    		FindLoop ar = new FindLoop();
		int[] aIsh = new int[5];
		aIsh[3] = 12345;
    		int result = ar.indexOf(aIsh, 12345);
    		assertThat(result, is(3));
	}
	/**
	 * Test NOT find element.
	*/
	@Test
	public void whenNOTSuccessfulFindElement() {
    		FindLoop ar = new FindLoop();
		int[] aIsh = new int[3];
    		int result = ar.indexOf(aIsh, 12345);
    		assertThat(result, is(-1));
	}
}
