package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Condition.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class PointTest {
	/**
	 * Test condition.
	*/
	@Test
	public void checkPoint() {
    	Point pot = new Point(1, 6);
	boolean result = pot.is(4, 2);
    	assertThat(result, is(true));
	}

}