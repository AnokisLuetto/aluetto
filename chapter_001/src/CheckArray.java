package ru.job4j;

//import java.io.*;
import java.util.*;

/**
 * Packages for check array task.
 * @author Anokis Luetto (mailto:anokis@gmail.com)
 * @version - $Id$
 * @since 0.1
*/
public class CheckArray {
    private int[] values;

    public int[] sort(int[] that) {
        this.values = that;
        return that;
    }

    public void echo() {
        System.out.println(this.values[0]);
    }

    public static void main(String[] args) {
        CheckArray ar = new CheckArray();
        final int[] immutable = new int[] {1};
	immutable[1] = -2;
        final int[] ri = ar.sort(immutable);
        //ri[0] = -1;
	//ar = null;
        ar.echo();
    }
}