package ru.job4j.array;

import org.junit.Test;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Array Unions.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class ArrayUnionsTest {
	/**
	 * Test Union 2 sorted arrays into 3.
	*/
	@Test
	public void thenMergeAllSortArray() {
		int[] arrayFirst = {1, 3, 5, 6, 9};
		int[] arrayNext = {2, 3, 4, 5, 10, 11};
		int[] expectArray = {1, 2, 3, 3, 4, 5, 5, 6, 9, 10, 11};
		ArrayUnions arr = new ArrayUnions();
		int[] arrayResult = arr.unionAll(arrayFirst, arrayNext);
		assertThat(arrayResult, is(expectArray));
		System.out.println(Arrays.toString(arrayResult));
	}
	/**
	 * Test Union 2 sorted arrays into 3 unique array.
	*/
	@Test
	public void thenMergeUniqueSortArray() {
		int[] arrayFirst = {1, 1, 5, 6, 9};
		int[] arrayNext = {1, 1, 1, 2, 10, 11};
		int[] expectArray = {1, 2, 5, 6, 9, 10, 11};
		ArrayUnions arr = new ArrayUnions();
		int[] arrayResult = arr.union(arrayFirst, arrayNext);
		assertThat(arrayResult, is(expectArray));
		System.out.println(Arrays.toString(arrayResult));
	}
}
