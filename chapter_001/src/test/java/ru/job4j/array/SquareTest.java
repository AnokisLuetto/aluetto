package ru.job4j.array;

import org.junit.Test;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for square.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class SquareTest {
	/**
	 * Test remove duplicate.
	*/
	@Test
	public void arrayElementsToSquare() {
		int[] expectArray = {1, 4, 9, 16, 25};
    		Square ar = new Square();
    		int[] resultArray = ar.calculate(5);
    		assertThat(resultArray, is(expectArray));
		System.out.println(Arrays.toString(resultArray));
	}
}
