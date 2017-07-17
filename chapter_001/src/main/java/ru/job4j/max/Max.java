package ru.job4j.max;

/**
 * Packages for max task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class Max {
	/**
	 * @param first может содержать только целове число
	 * @param second может содержать только целове число
	 * @return max результат - может содержать только целове число
	*/
	public int max(int first, int second) {
		boolean condition = false;
		if (first > second) {
			condition = true;
		}
		return condition ? first : second;
	}
}