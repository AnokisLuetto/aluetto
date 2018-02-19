package ru.job4j.array;

/**
 * Packages for Array Contains task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class ArrayContains {
	/**
	 * @param origin - исходное выражение.
	 * @param sub - искомое выражение.
	 * @return результат - возвращает логическое true/false.
	*/
	public boolean contains(String origin, String sub) {
		boolean result = false;
		char[] originvalue = origin.toCharArray();
		char[] subvalue = sub.toCharArray();
		//проверяем, что массив originvalue содержит выражение subvalue
		for (int out = 0; out <= originvalue.length - sub.length(); out++) {
			int cnt = 0;
			for (int in = out; in < (out + subvalue.length); in++) {
	                        if (subvalue[in - out] == originvalue[in]) {
					cnt++;
				}
			}
			if (cnt == subvalue.length) {
				result = true;
				break;
			}
		}
		return result;
	}
}
