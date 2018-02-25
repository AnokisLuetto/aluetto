package ru.job4j.array;

import java.util.Arrays;

/**
 * Packages for Array Unions task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class ArrayUnions {
	/**
	 * @param arrayFirst - инициализация 1 отсортированного массива.
	 * @param arrayNext - инициализация 2 отсортированного массива.
	 * @return результат - возвращает 3й объединенный массив, с удалением дубликатов.
	*/
	public int[] union(int[] arrayFirst, int[] arrayNext) {
		int[] arrayMerge = new int[arrayFirst.length + arrayNext.length];
		int currentValue = 0;
		int lengthArrayFirst = currentValue;
		int lengthArrayNext = currentValue;
		int lengthArrayMerge = currentValue;
		while (lengthArrayFirst < arrayFirst.length | lengthArrayNext < arrayNext.length) {
			if (lengthArrayFirst < arrayFirst.length && arrayFirst[lengthArrayFirst] <= arrayNext[lengthArrayNext]) {
				currentValue = arrayFirst[lengthArrayFirst];
				lengthArrayFirst++;
			} else {
				currentValue = arrayNext[lengthArrayNext];
				lengthArrayNext++;
			}
			if (arrayMerge[lengthArrayMerge - (lengthArrayMerge == 0 ? 0 : 1)] != currentValue) {
				arrayMerge[lengthArrayMerge] = currentValue;
				lengthArrayMerge++;
			}
		}
		return Arrays.copyOf(arrayMerge, lengthArrayMerge);
	}
	/**
	 * @param arrayFirst - инициализация 1 отсортированного массива.
	 * @param arrayNext - инициализация 2 отсортированного массива.
	 * @return результат - возвращает 3й объединенный массив, без удаления дубликатов.
	*/
	public int[] unionAll(int[] arrayFirst, int[] arrayNext) {
		int[] arrayMerge = new int[arrayFirst.length + arrayNext.length];
		int lengthArrayFirst = 0;
		int lengthArrayNext = 0;
		int lengthArrayMerge = 0;
		while (lengthArrayFirst < arrayFirst.length | lengthArrayNext < arrayNext.length) {
			if (lengthArrayFirst < arrayFirst.length && lengthArrayFirst <= lengthArrayNext && arrayFirst[lengthArrayFirst] <= arrayNext[lengthArrayNext]) {
				arrayMerge[lengthArrayMerge] = arrayFirst[lengthArrayFirst];
				lengthArrayFirst++;
			} else {
				arrayMerge[lengthArrayMerge] = arrayNext[lengthArrayNext];
				lengthArrayNext++;
			}
			lengthArrayMerge++;
		}
		return arrayMerge;
	}
}
