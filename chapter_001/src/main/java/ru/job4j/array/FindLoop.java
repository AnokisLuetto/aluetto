package ru.job4j.array;

/**
 * Packages for Array task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class FindLoop {
	/**
	 * @param data - инициализация массива.
	 * @param el - искомый индекс.
	 * @return результат - организует поиск элемента в массиве, возвращает индекс элемента.
	*/
	public int indexOf(int[] data, int el) {
		int rsl = -1; //если элемента нет в массмме, то возвращаем -1.
		for (int index = 0; index < data.length; index++) {
			if (data[index] == el) {
				rsl = index;
				break;
			}
		}
		return rsl;
	}
}
