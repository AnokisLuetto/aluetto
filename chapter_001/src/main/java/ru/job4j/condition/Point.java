package ru.job4j.condition;

/**
 * Packages for Condition task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.2
*/
public class Point {
	/**
	 * Внутреннее поле.
	*/
	private int x;
	/**
	 * Внутреннее поле.
	*/
	private int y;
	/**
	 * Point - Инициализация.
	 *
	 * @param x может содержать число с плавающей точкой
	 * @param y может содержать число с плавающей точкой
	*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * getX - Получение Х-координаты.
	 * @return max результат - может содержать только целове число
	*/
	public int getX() {
		return this.x;
	}
	/**
	 * getX - Получение Х-координаты.
	 * @return max результат - может содержать только целове число
	*/
	public int getY() {
		return this.y;
	}
	/**
	 * is - Определяет находится ли точка на фукнции: y(x) = a * x + b.
	 *
	 * @param a может содержать число с плавающей точкой
	 * @param b может содержать число с плавающей точкой
	 * @return max результат - может содержать только целове число
	*/
	public boolean is(int a, int b) {
		return this.y == a * this.x + b;
	}
	 /**
	 * distanceTo - Определяет расстояние между 2мя точками.
	 *
	 * @param that инициализация точек
	 * @return результат - может содержать число с плавающей точкой
	*/
	public double distanceTo(Point that) {
		double dx = this.x - that.x;
		double dy = this.y - that.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}

