package ru.job4j.max;

/**
 * Packages for Factorial task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class Factorial {
	/**
	 * @param n - положительное целое число
	 * @return результат вычисления факториала
	*/
	public int calc(int n) {
		int res = 1;
		for (int index = 1; index <= n; index++) {
			res *= index;
		}
		return n == 0 ? 1 : res;
		//return n == 0 ? 1 : IntStream.rangeClosed(1, n).map(i -> i * n);
	}
}
