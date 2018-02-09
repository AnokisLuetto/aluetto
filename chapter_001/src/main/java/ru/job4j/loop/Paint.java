package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Packages for Paint task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class Paint {
	/**
	 * @param height - размерность пирамиды по высоте, может содержать только целое число
	 * @return результат - псевдографика изображения пирамиды, ее право части
	*/
	public String rightTrl(int height) {
		//Буфер для результата.
		StringBuilder screen = new StringBuilder();
		//ширина будет равна высоте.
		int weight = height;
		//внешний цикл двигается по строкам.
		for (int row = 0; row != height; row++) {
			//внутренний цикл определяет положение ячейки в строке.
			for (int column = 0; column != weight; column++) {
				//если строка равна ячейке, то рисуем галочку.
				//определяем сколько галочек будет в строке.
				if (row >= column) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			//добавляем перевод на новую строчку.
			screen.append(System.lineSeparator());
		}
		//Получаем результат.
		return screen.toString();
	}

	/**
	 * @param height - размерность пирамиды по высоте, может содержать только целое число
	 * @return результат - псевдографика изображения пирамиды, ее левой части
	*/
	public String leftTrl(int height) {
		//Буфер для результата.
		StringBuilder screen = new StringBuilder();
		//ширина будет равна высоте.
		int weight = height;
		//внешний цикл двигается по строкам.
		for (int row = 0; row != height; row++) {
			//внутренний цикл определяет положение ячейки в строке.
			//for (int column = weight - 1; column != -1; column--) {
			for (int column = 0; column != weight; column++) {
				//если строка равна ячейке, то рисуем галочку.
				//определяем сколько галочек будет в строке.
				//if (row >= column) {
				if (row >= weight - column - 1) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			//добавляем перевод на новую строчку.
			screen.append(System.lineSeparator());
		}
		//Получаем результат.
		return screen.toString();
	}

	/**
	 * @param height - размерность пирамиды по высоте, может содержать только целое число
	 * @return результат - псевдографика изображения пирамиды
	*/
	public String piramid(int height) {
		StringBuilder screen = new StringBuilder();
		//ширина будет равна высоте.
		int weight = 2 * height - 1;
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (row >= height - column - 1 && row + height - 1 >= column) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}

	/**
	 * @param height - размерность пирамиды по высоте, может содержать только целое число
	 * @param weight - размерность пирамиды по ширине, может содержать только целое число
	 * @param predict - размерность пирамиды по ширине, может содержать только целое число
	 * @return результат - псевдографика изображения пирамиды
	*/
	public String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
		StringBuilder screen = new StringBuilder();
		for (int row = 0; row != height; row++) {
			for (int column = 0; column != weight; column++) {
				if (predict.test(row, column)) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}

	/**
	 * @param height - размерность пирамиды по высоте, может содержать только целое число
	 * @return результат - псевдографика изображения пирамиды, ее правой части, через Generics
	*/
	public String loopRightTrl(int height) {
		return this.loopBy(
			height,
			height,
			(row, column) -> row >= column
		);
	}

	/**
	 * @param height - размерность пирамиды по высоте, может содержать только целое число
	 * @return результат - псевдографика изображения пирамиды, ее правой части, через Generics
	*/
	public String loopLeftTrl(int height) {
		return this.loopBy(
			height,
			height,
			(row, column) -> row >= height - column - 1
		);
	}

	/**
	 * @param height - размерность пирамиды по высоте, может содержать только целое число
	 * @return результат - псевдографика изображения пирамиды, через Generics
	*/
	public String loopPiramid(int height) {
		return this.loopBy(
			height,
			2 * height - 1,
			(row, column) -> row >= height - column - 1 && row + height - 1 >= column
		);
	}
}
