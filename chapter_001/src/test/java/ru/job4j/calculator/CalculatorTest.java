package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Calculator.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class CalculatorTest {
	/**
	 * Test add.
	*/
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		assertThat(result, is(2D));
		}
	/**
	 * Test substruct.
	*/
	@Test
	public void whenOneSubstructFromAnother() {
		Calculator calc = new Calculator();
		calc.substruct(2D, 1D);
		double result = calc.getResult();
		assertThat(result, is(1D));
		}
	/**
	 * Test div.
	*/
	@Test
	public void whenOneDividedIntoAnother() {
		Calculator calc = new Calculator();
		calc.div(2D, 1D);
		double result = calc.getResult();
		assertThat(result, is(2D));
		}
	/**
	 * Test multiple.
	*/
	@Test
	public void whenOneMultiplyedByAnother() {
		Calculator calc = new Calculator();
		calc.multiple(2D, 1D);
		double result = calc.getResult();
		assertThat(result, is(2D));
		}
}
