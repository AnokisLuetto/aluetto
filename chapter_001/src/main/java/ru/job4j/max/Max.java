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
		return first > second ? first : second;
	}
	/**
	 * @param first может содержать только целове число
	 * @param second может содержать только целове число
	 * @param third может содержать только целове число
	 * @return max результат - может содержать только целове число
	*/
	public int max(int first, int second, int third) {
		return Math.max(Math.max(first, second), third);
	}
}