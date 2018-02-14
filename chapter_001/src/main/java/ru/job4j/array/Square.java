package ru.job4j.array;

/**
 * Packages for Square task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class Square {
	/**
	 * @param bound - инициализация массива.
	 * @return результат - возвращает массив с уникальными, не повторяюшимися значениями.
	*/
	public int[] calculate(int bound) {
		int[] rst = new int[bound];
		for (int index = 1; index <= bound; index++) {
			rst[index - 1] = index * index;
		}
		return rst;
	}
}
