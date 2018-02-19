package ru.job4j.array;

/**
 * Packages for Array Char task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class ArrayChar {
	/**
	 * Внутреннее поле.
	*/
	private char[] data;
	/**
	 * @param line - инициализация переменной.
	*/
	public ArrayChar(String line) {
		this.data = line.toCharArray();
	}
	/**
	 * @param prefix - инициализация переменной.
	 * @return результат - возвращает массив символов.
	*/
	public boolean srartWith(String prefix) {
		boolean result = true;
		char[] value = prefix.toCharArray();
		//проверяем, что массив data имеет первые элементы одиннаковые с value
		for (int index = 0; index < value.length; index++) {
			if (value[index] != data[index]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
