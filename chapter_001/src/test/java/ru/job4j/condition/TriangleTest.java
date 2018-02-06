package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test for Condition Triangle.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class TriangleTest {
	/**
	 * Test condition triangle.
	*/
	@Test
	public void whenAreaSetThreePointsThenTriangleArea() {
	//Создаем три объекта класса Pint
    	Point a = new Point(0, 0);
    	Point b = new Point(0, 2);
    	Point c = new Point(2, 0);
	//Создаем объект треугольник и передаем в него объект точек класса Point
	Triangle triangle = new Triangle(a, b, c);
	//Вычисляем площадь
	double result = triangle.area();
	//Задаем ожидаемый результат
	double expected = 2D;
	//Проверяем результат и ожидаемое значение
    	assertThat(result, closeTo(expected, 2.0));
	}
}
