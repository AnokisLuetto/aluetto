package ru.job4j.array;

/**
 * Packages for BubbleSort task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class BubbleSort {
	/**
	 * @param array - инициализация массива.
	 * @return результат - возвращает отсортированный массив.
	*/
	public int[] sort(int[] array) {
		int tmp;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j - 1] > array[j]) {
					tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}
}
