package ru.job4j.array;

import java.util.Arrays;

/**
 * Packages for Array Duplicate task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class ArrayDuplicate {
	/**
	 * @param array - инициализация массива.
	 * @return результат - возвращает массив с уникальными, не повторяюшимися значениями.
	*/
	public String[] remove(String[] array) {
		int unique = array.length;
		for (int out = 0; out < unique; out++) {
			for (int in = out + 1; in < unique; in++) {
				if (array[in] == array[out]) {
				array[in] = array[unique - 1];
				unique--;
				in--;
				}
			}
		}
		return Arrays.copyOf(array, unique);
	}
}
