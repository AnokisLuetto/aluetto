package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
 */
public class CalculateTest {
    /**
     * Test whenAddOneToOneThenTwo.
     */
    @Test
    public void whenAddOneToOneThenTwo() {
        Calculate calc = new Calculate();
        String result = calc.echo("Hello world!");
        String expect = "Hello world!";
        assertThat(result, is(expect));
    }
}
