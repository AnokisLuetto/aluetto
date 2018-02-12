package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for ArrayDuplicate.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class ArrayDuplicateTest {
	/**
	 * Test remove duplicate.
	*/
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		String[] initArray = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] expectArray = {"Привет", "Мир", "Супер"};
    		ArrayDuplicate ar = new ArrayDuplicate();
    		String[] resultArray = ar.remove(initArray);
    		assertThat(resultArray, is(expectArray));
	}
}
