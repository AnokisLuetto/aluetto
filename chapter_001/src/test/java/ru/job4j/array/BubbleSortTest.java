package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for BubbleSort.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class BubbleSortTest {
	/**
	 * Test bubble sort.
	*/
	@Test
	public void checkBubbleSort() {
		int[] initArray = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] expectArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
    		BubbleSort ar = new BubbleSort();
    		int[] resultArray = ar.sort(initArray);
    		assertThat(resultArray, is(expectArray));
	}
}
