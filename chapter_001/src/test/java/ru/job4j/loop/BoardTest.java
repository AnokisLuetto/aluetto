package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Board.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/

public class BoardTest {
	/**
	 * Test Board when 3x3 size.
	*/
	@Test
	public void when3x3() {
    		Board board = new Board();
    		String result = board.paint(3, 3);
		String ln = System.lineSeparator();
    		assertThat(result, is(String.format("X X%s X %sX X%s", ln, ln, ln)));
	}
	/**
	 * Test Board when 3x3 size by "getProperty".
	*/
	@Test
	public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
    		Board board = new Board();
    		String result = board.paint(3, 3);
		System.out.println(result);
		final String line = System.getProperty("line.separator");
		String expected = String.format("X X%s X %sX X%s", line, line, line);
    		assertThat(result, is(expected));
	}
	/**
	 * Test Board when 5x4 size by "getProperty".
	*/
	@Test
	public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
    		Board board = new Board();
    		String result = board.paint(5, 4);
		System.out.println(result);
		final String line = System.getProperty("line.separator");
		String expected = String.format("X X X%s X X %sX X X%s X X %s", line, line, line, line);
    		assertThat(result, is(expected));
	}
}
