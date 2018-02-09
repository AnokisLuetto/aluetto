package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Piramid.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/

public class PaintTest {
	/**
	 * Test right piramid.
	*/
	@Test
	public void whenPiramid4Rigth() {
		Paint paint = new Paint();
		String rst = paint.rightTrl(4);
		System.out.println(rst);
		assertThat(rst,
			is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("^   ")
				.add("^^  ")
				.add("^^^ ")
				.add("^^^^")
				.toString()
				)
			);
	}

	/**
	 * Test left piramid.
	*/
	@Test
	public void whenPiramid4Left() {
		Paint paint = new Paint();
		String rst = paint.leftTrl(4);
		System.out.println(rst);
		assertThat(rst,
			is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("   ^")
				.add("  ^^")
				.add(" ^^^")
				.add("^^^^")
				.toString()
				)
			);
	}

	/**
	 * Test fully piramid.
	*/
	@Test
	public void whenFullyPiramid() {
		Paint paint = new Paint();
		String rst = paint.piramid(4);
		System.out.println(rst);
		assertThat(rst,
			is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("   ^   ")
				.add("  ^^^  ")
				.add(" ^^^^^ ")
				.add("^^^^^^^")
				.toString()
				)
			);
	}


	/**
	 * Test fully piramid by Generics.
	*/
	@Test
	public void whenFullyLoopPiramid() {
		Paint paint = new Paint();
		String rst = paint.loopPiramid(4);
		System.out.println(rst);
		assertThat(rst,
			is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("   ^   ")
				.add("  ^^^  ")
				.add(" ^^^^^ ")
				.add("^^^^^^^")
				.toString()
				)
			);
	}
}
