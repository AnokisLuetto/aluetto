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
public class TurnTest {
	/**
	 * Test revers array with Even.
	*/
	@Test
	public void whenTurnArrayWithEvenAmountofElementsThenTurnedArray() {
		int[] aIsh = {2, 6, 1, 4};
		int[] aAss = {4, 1, 6, 2};
    		Turn ar = new Turn();
    		int[] result = ar.back(aIsh);
    		assertThat(result, is(aAss));
	}
	/**
	 * Test revers array with Odd.
	*/
	@Test
	public void whenTurnArrayWithOddAmountofElementsThenTurnedArray() {
		int[] aIsh = {1, 2, 3, 4, 5};
		int[] aAss = {5, 4, 3, 2, 1};
    		Turn ar = new Turn();
    		int[] result = ar.back(aIsh);
    		assertThat(result, is(aAss));
	}
}
