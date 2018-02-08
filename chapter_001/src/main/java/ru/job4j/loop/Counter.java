package ru.job4j.max;

/**
 * Packages for Counter task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class Counter {
	/**
	 * @param start - начало диапазона, может содержать только целое число
	 * @param finish - конец диапазона, может содержать только целое число
	 * @return результат суммы четных чисел по заданному диапазону
	*/
	public int add(int start, int finish) {
		int summ = 0;
		for (int index = start; index <= finish; index++) {
			summ += (index % 2 == 0 ? index : 0);
		}
		return summ;
	}
}
