package ru.job4j.array;

/**
 * Packages for Turn task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class Turn {
	/**
	 * @param data - инициализация массива.
	 * @return результат - вовзращает реверс элементов исходного массива.
	*/
	public int[] back(int[] data) {
		int[] arTmp = new int[data.length];
		for (int index = 0; index < data.length; index++) {
			arTmp[arTmp.length - 1 - index] = data[index];
		}
		return arTmp;
	}
}
