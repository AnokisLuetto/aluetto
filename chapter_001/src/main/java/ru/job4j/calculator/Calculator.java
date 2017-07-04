package ru.job4j.calculator;

/**
 * Packages for Calculator task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class Calculator {
	/**
	 * Внутреннее поле.
	*/
	private double result;
	/**
	 * add - Сложение.
	 *
	 * @param first может содержать число с плавающей точкой
	 * @param second может содержать число с плавающей точкой
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	 * substruct - Вычитание.
	 *
	 * @param first может содержать число с плавающей точкой
	 * @param second может содержать число с плавающей точкой
	*/
	public void substruct(double first, double second) {
		this.result = first - second;
	}
	/**
	 * div - Деление.
	 *
	 * @param first может содержать число с плавающей точкой
	 * @param second может содержать число с плавающей точкой
	*/
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
	 * multiple - Умножение.
	 *
	 * @param first может содержать число с плавающей точкой
	 * @param second может содержать число с плавающей точкой
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	 * getResult - Вывод результата .
	 *
	 * @return result может содержать число с плавающей точкой
	*/
	public double getResult() {
		return this.result;
	}
}