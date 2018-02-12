package ru.job4j.array;

/**
 * Packages for Matrix task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class Matrix {
	/**
	 * @param size - инициализация размера матрицы.
	 * @return результат - возвращает матрицу произведений пересечений ее элементов.
	*/
	public int[][] multiple(int size) {
		int[][] data = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				data[i][j] = (i + 1) * (j + 1);
			}
		}
		return data;
	}
}
