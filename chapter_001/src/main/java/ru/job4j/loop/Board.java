package ru.job4j.loop;

/**
 * Packages for Board task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class Board {
	/**
	 * @param width - размерность шахматной доски по ширине, может содержать только целое число
	 * @param height - размерность шахматной доски по высоте, может содержать только целое число
	 * @return результат - псевдографика изображения шахматной доски, где сумма width и height дающая четное число, заполняются символом "X"
	*/
	public String paint(int width, int height) {
		StringBuilder screen = new StringBuilder();
		String ln = System.lineSeparator();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				//условие провери, что писать пробел или X.
				//в задании определили закономерность вставки X.
				if ((i + j) % 2 == 0) {
					screen.append("X");
				} else {
					screen.append(" ");
				}
			}
			//добавляем перевод на новую строку.
			screen.append(ln);
		}
		return screen.toString();
	}
}
